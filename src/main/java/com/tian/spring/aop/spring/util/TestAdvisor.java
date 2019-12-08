package com.tian.spring.aop.spring.util;

import com.tian.spring.aop.spring.service.Person;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-03
 */
public class TestAdvisor {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-aop-advisor.xml");
        Person person = (Person) context.getBean("personProxy");
        person.eat();
        person.wc();
    }

}
