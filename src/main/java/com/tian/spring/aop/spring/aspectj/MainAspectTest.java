package com.tian.spring.aop.spring.aspectj;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-14
 */
public class MainAspectTest {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-aop-aspectj-ano.xml");
        UserServiceImp userServiceImp = (UserServiceImp) context.getBean("userServiceImp");
        userServiceImp.addUser("aaa");
        Class clazz = userServiceImp.getClass();
        Method[] methods = clazz.getMethods();
        for (Method me : methods) {
            System.out.println(me.getName());
        }
    }

}
