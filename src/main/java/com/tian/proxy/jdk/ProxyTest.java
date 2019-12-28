package com.tian.proxy.jdk;

import java.lang.reflect.Proxy;

/**
 * @author tianchengbei
 * @since 2019-12-23
 */
public class ProxyTest {

    public static void main(String[] args) {
        Person man = new Man();
        Person proxyMan = (Person) Proxy.newProxyInstance(man.getClass().getClassLoader(),man.getClass().getInterfaces(),new MyInvocationHandler(man));
        proxyMan.eat();
    }

}
