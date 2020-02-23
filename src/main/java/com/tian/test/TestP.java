package com.tian.test;

import java.lang.reflect.Method;

/**
 * @author tianchengbei
 * @since 2019-12-12
 */
public class TestP {

    public static void main(String[] args) throws Exception {
        TestP tp = new TestP();
        Method say = tp.getClass().getMethod("say", Integer.class);
        Object invoke = say.invoke(tp, 34);
        System.out.println(invoke);
        Object a  = new Object();
    }

    public int say(Integer a){
        System.out.println("say..."+a);
        return 34;
    }

}
