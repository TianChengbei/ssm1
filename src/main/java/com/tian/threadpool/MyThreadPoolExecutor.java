package com.tian.threadpool;

import java.util.HashSet;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author tianchengbei
 * @since 2019-11-14
 */
public class MyThreadPoolExecutor {

    private final BlockingQueue<Runnable> workQueue;// 待执行的任务，相当于任务缓冲区，其实例对象有ArrayBlockingQueue,LinkedBlockingQueue等
    private final ReentrantLock mainLock = new ReentrantLock();
    private final HashSet<Worker> workers = new HashSet<Worker>();// 线程池中的执行线程
    private int corePoolSize;// 初始化的线程的个数

    private int maxPoolSize;// 线程池的最大个数，当corePoolSize满了，而且BlockingQueue缓冲队列也满了，则初始化额外的线程，如果额外的线程达到上限，则任务丢弃
    private int workPoolSize;// 正在工作的线程
    private final boolean allowCoreThreadTimeOut;
    private final long keepAliveTime;
    private final TimeUnit timeUnit;

    public MyThreadPoolExecutor(int corePoolSize, int maxPoolSize,
                                boolean allowCoreThreadTimeOut, long keepAliveTime,
                                TimeUnit timeUnit, BlockingQueue<Runnable> workQueue) {
        this.workQueue = workQueue;
        this.corePoolSize = corePoolSize;
        this.maxPoolSize = maxPoolSize;
        this.allowCoreThreadTimeOut = allowCoreThreadTimeOut;
        this.keepAliveTime = keepAliveTime;
        this.timeUnit = timeUnit;
    }


    public MyThreadPoolExecutor(BlockingQueue<Runnable> workQueue,
                                int corePoolSize, int maxPoolSize) {
        this(corePoolSize, maxPoolSize, false, 0l, TimeUnit.SECONDS, workQueue);
    }

// 主要方法的实现

    public void execute(Runnable task) {
        if (task == null) {
            throw new IllegalArgumentException("The parameter is not null");
        }
        Worker work = null;
        mainLock.lock();
        if (workPoolSize < corePoolSize) {// 创建线程进行执行
            work = new Worker(task);
        } else if (!workQueue.offer(task)) {// 放到缓存队列中
            if (workPoolSize < maxPoolSize) {// 开启额外的线程的进行执行
                work = new Worker(task);
            } else {
                throw new RuntimeException("The task was thowed");// 任务的抛弃策略，这里使用抛出异常，即这个任务无法处理
            }
        }

        if (work != null) {
            workers.add(work);
            work.t.start();
            workPoolSize++;
        }

        mainLock.unlock();

    }


    public void shutDownNow() {
        for (Worker w : workers) {
            w.t.stop();
        }
    }


    private class Worker implements Runnable {

        private Runnable firstTask;
        private Thread t;

        private boolean state;//0:空闲 1：代表忙碌

        public Worker(Runnable firstTask) {
            super();
            this.firstTask = firstTask;
            this.t = new Thread(this);
        }

        @Override
        public void run() {
            runWorker(this);
        }


        private void runWorker(Worker w) {
            Runnable task = w.firstTask;
            w.firstTask = null;
            while (task != null || (task = getTask()) != null) {
                task.run();
                task = null;
            }

        }


        private Runnable getTask() {
            boolean timeOut;

            timeOut = allowCoreThreadTimeOut || workPoolSize > corePoolSize;

            try {
// 如果是该线程长期存活，那么使用take线程阻塞的函数，如果是一旦没有任务就销毁线程，1.是核心线程
// 2.线程数大于核心线程，即目前任务不多,线程多余
                Runnable task = timeOut ? workQueue.poll(keepAliveTime,
                        timeUnit) : workQueue.take();
                if (task != null) {
                    return task;
                } else {
                    // 如果没有任务被获取,则这个线程即将被销毁
                    mainLock.lock();
                    workPoolSize--;
                    mainLock.unlock();
                    System.out.println("当前线程被销毁");
                    workers.remove(this);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return null;
        }
    }

}
