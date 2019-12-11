package com.tian.test;


import java.util.Optional;

/**
 * @author tianchengbei
 * @since 2019-11-25
 */
public class OptionalTest {

    public static void main(String[] args) {
        System.out.println(getGender(null));
        System.out.println(getGender1(null));
    }

    public static String getGender(String student) {
        if (null == student) {
            return "Unkown";
        }
        return student.length()+"";
    }

    public static String getGender1(String student) {
//        return null;
        return Optional.ofNullable(student).map(u -> u.length()+"").orElse("Unkown");
    }

}
