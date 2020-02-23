package com.tian.test;

import java.util.concurrent.CountDownLatch;

public class CountDownLachTest {

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        countDownLatch.await();
        countDownLatch.countDown();
    }

}
