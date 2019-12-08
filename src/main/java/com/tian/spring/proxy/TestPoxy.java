package com.tian.spring.proxy;

import com.tian.spring.aop.spring.service.Person;
import com.tian.spring.aop.spring.service.impl.PersonImpl;
import java.lang.reflect.Proxy;

/**
 * @author tianchengbei
 * @since 2019-12-05
 */
public class TestPoxy {

    public static void main(String[] args) {
        Person p = new PersonImpl();
        PersonProxy pp = new PersonProxy(p);
        Person proxy = (Person) Proxy.newProxyInstance(p.getClass().getClassLoader(), p.getClass().getInterfaces(), pp);
        proxy.eat();
    }

}
