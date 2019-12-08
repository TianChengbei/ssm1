package com.tian.spring.proxy;

import com.tian.spring.aop.spring.service.Person;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tianchengbei
 * @since 2019-12-05
 */
public class PersonProxy implements InvocationHandler {
    private Person person;
    public PersonProxy(Person person){
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("打印日志。。。。。。。。start");
        //执行被代理类的方法
        method.invoke(person,args);
        System.out.println("打印日志。。。。。。。。end");
        return null;
    }
}
