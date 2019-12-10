package com.tian.spring;

import com.tian.spring.model.Student;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class Test {

    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Student student3 = (Student) context.getBean("student3");
//        Student student2 = (Student) context.getBean("student2");
//        System.out.println(student3);
//        System.out.println(student2);

        HashMap<String,Object> map = new HashMap<>();
        System.out.println(map.size());
        map.put("ss","dd");
//        ConcurrentHashMap<String,Object> concurrentHashMap = new ConcurrentHashMap<>();
//        concurrentHashMap.put("","");
//        AtomicInteger a = new AtomicInteger(12);
    }

}
