package com.tian.spring.model;

import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class Teacher {

    private String name;
    private List<String> friend;
    private String[] school;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getFriend() {
        return friend;
    }

    public void setFriend(List<String> friend) {
        this.friend = friend;
    }

    public String[] getSchool() {
        return school;
    }

    public void setSchool(String[] school) {
        this.school = school;
    }
}
