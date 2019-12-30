package com.tian.spring.aop.use;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-30
 */

public class UserDaoAspectTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-aspectj-use.xml");
        UserDaoImpl userDao = context.getBean(UserDaoImpl.class);
        userDao.addUser("tianchengbei",25);
    }

}
