package com.tian.test;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author tianchengbei
 * @since 2019-12-11
 */
public class TestRentrenlock {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        ReentrantReadWriteLock rwlock = new ReentrantReadWriteLock();
        rwlock.readLock();
    }

}
