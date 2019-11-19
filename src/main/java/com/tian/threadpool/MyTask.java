package com.tian.threadpool;

/**
 * @author tianchengbei
 * @since 2019-11-14
 */
public class MyTask implements Runnable {

    private int taskNum;

    public MyTask(int taskNum) {
        super();
        this.taskNum = taskNum;
    }

    @Override
    public void run() {
        System.out.println("正在执行:" + taskNum + "任务");
        try {
            Thread.sleep(1000);
            System.out.println("任务" + taskNum + "結束");
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
