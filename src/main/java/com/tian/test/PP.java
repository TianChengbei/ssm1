package com.tian.test;

import com.tian.test.model.User;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * @author tianchengbei
 * @since 2019-12-16
 */
public class PP {

     String ss = "fdfd";

    public static void main(String[] args) throws SQLException {
        ReentrantLock lock = new ReentrantLock();
        lock.lock();
        lock.unlock();
        User user = new User();
        DriverManager.getConnection(null    );

    }

}
