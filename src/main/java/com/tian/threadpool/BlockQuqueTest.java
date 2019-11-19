package com.tian.threadpool;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * @author tianchengbei
 * @since 2019-11-14
 */
public class BlockQuqueTest {

    public static void main(String[] args) throws InterruptedException {
        ArrayBlockingQueue<String> blockQueue = new ArrayBlockingQueue<>(10);
        blockQueue.peek();
        blockQueue.offer("ee");
        blockQueue.put("dd");
        blockQueue.poll();
        blockQueue.take();
    }


}
