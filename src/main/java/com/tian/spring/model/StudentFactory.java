package com.tian.spring.model;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class StudentFactory {

    public Student createStudent(){
        System.out.println("studentfactory 创建。。。。");
        return new Student();
    }

}
