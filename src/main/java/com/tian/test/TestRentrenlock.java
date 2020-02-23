package com.tian.test;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author tianchengbei
 * @since 2019-12-11
 */
public class TestRentrenlock {

    public static void main(String[] args) throws InterruptedException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.tryLock();
        lock.unlock();
        Condition condition = lock.newCondition();
        condition.signal();
        condition.await();
        ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
        rwlock.readLock();
    }

}
