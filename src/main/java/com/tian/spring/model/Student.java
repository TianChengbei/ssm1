package com.tian.spring.model;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class Student {
    private String name;

    public Student() {
    }


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    private Integer age;

}
