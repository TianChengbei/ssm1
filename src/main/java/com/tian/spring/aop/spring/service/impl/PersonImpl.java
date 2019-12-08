package com.tian.spring.aop.spring.service.impl;

import com.tian.spring.aop.spring.service.Person;
import org.springframework.aop.framework.ProxyFactoryBean;

/**
 * @author tianchengbei
 * @since 2019-12-03
 */
public class PersonImpl implements Person {


    @Override
    public void eat() {
        System.out.println("吃饭。。。。");

    }

    @Override
    public void wc() {
        System.out.println("上厕所。。。。");
    }
}
