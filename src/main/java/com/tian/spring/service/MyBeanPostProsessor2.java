package com.tian.spring.service;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class MyBeanPostProsessor2 implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("MyBeanPostProsessor2 调用前。。"+s);
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("MyBeanPostProsessor2 调用后。。"+s);
        return o;
    }
}
