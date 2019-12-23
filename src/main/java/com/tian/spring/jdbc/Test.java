package com.tian.spring.jdbc;

import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author tianchengbei
 * @since 2019-12-14
 */
public class Test {

    public static void main(String[] args) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        PlatformTransactionManager platformTransactionManager = null;
        TransactionDefinition transactionDefinition = null;
        TransactionStatus transactionStatus = null;
        TransactionTemplate transactionTemplate = null;
        AtomicInteger atomicInteger = new AtomicInteger(12);
        atomicInteger.get();
    }

}
