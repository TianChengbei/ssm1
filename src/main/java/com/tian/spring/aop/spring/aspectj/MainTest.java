package com.tian.spring.aop.spring.aspectj;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-14
 */
public class MainTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop-aspectj.xml");
        UserServiceImp userServiceImp = (UserServiceImp)context.getBean("userServiceImp");
        userServiceImp.addUser("aaa");
    }

}
