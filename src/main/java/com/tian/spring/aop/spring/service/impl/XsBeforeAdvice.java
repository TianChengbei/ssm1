package com.tian.spring.aop.spring.service.impl;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 * @author tianchengbei
 * @since 2019-12-03
 */
public class XsBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("---洗手------");
    }
}
