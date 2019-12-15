package com.tian.spring.aop.spring.service.impl;

import com.tian.spring.aop.spring.service.Person;

/**
 * @author tianchengbei
 * @since 2019-12-04
 */
public class NomalPersonImpl implements Person {
    @Override
    public void eat() {
        System.out.println("平常人吃饭。。。");
    }

    @Override
    public void wc() {
        System.out.println("平常人上厕所。。。。");
    }

    @Override
    public Integer sx(Integer a) {
        return null;
    }
}
