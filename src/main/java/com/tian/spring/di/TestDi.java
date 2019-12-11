package com.tian.spring.di;

import com.tian.spring.di.service.UserService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-10
 */
public class TestDi {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean-autowird.xml");
        UserService us = (UserService)context.getBean("userService");
        us.say();
    }

}
