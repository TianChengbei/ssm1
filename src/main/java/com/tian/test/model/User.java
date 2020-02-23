package com.tian.test.model;

import com.tian.test.PP;

/**
 * @author tianchengbei
 * @since 2019-12-04
 */
public class User {
    private Long id;
    private String name;
    private Integer age;
    String st = "dfd";
    public User() {
    }

    public static void main(String[] args) {
        PP p = new PP();
    }

    public User(Long id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj.getClass() == this.getClass())){
            return false;
        }
        User other = (User) obj;
        return this.getId().equals(other.getId());
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
