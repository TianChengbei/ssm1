package com.tian.spring;

import com.tian.spring.model.BeanScope;
import com.tian.spring.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class TestSp {

    public static void main(String[] args) throws Exception {

        BeanDefine stu = new BeanDefine();
        stu.setId("student");
        stu.setClassPath("com.tian.spring.model.Student");
        stu.setScope(BeanScope.singleton);

        List<BeanDefine> list = new ArrayList<>();
        list.add(stu);

        BeanFactory factory = new BeanFactory(list);

        Student student = (Student) factory.getBean("student");
        System.out.println(student);

        Student student1 = (Student) factory.getBean("student");
        System.out.println(student1);
    }

}
