package com.tian.test;

import com.tian.test.model.User;

public class TestClone implements Cloneable{

    private User user;

    public static void main(String[] args) throws CloneNotSupportedException {
        TestClone test = new TestClone();
        test.user = new User();
        test.user.setName("test");
        TestClone clone = (TestClone)test.clone();
        System.out.println(test == clone);
        System.out.println(clone.user == test.user);

    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        TestClone clone = new TestClone();
        User user = new User(   );
        clone.user = user;
        user.setName(this.user.getName());
        return clone;
    }
}
