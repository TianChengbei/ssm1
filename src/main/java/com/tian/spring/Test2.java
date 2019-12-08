package com.tian.spring;

import com.tian.spring.model.Dog;
import com.tian.spring.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-07
 */
public class Test2 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        Dog dog = (Dog) context.getBean("dog");
        System.out.println(dog.getAge());
    }

}
