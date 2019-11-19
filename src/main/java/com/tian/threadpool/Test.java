package com.tian.threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * @author tianchengbei
 * @since 2019-11-14
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        MyThreadPoolExecutor executor = new MyThreadPoolExecutor(2, 6, false, 100, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(4));
        for (int i = 0; i < 10; i++) {
            Thread.sleep(100);
            executor.execute(new MyTask(i));
        }
    }


    //2 3 4 5 8 9 7 6

}
