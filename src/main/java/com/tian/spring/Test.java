package com.tian.spring;

import com.tian.spring.model.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class Test {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student3 = (Student) context.getBean("student3");
        Student student2 = (Student) context.getBean("student2");
        System.out.println(student3);
        System.out.println(student2);
    }

}
