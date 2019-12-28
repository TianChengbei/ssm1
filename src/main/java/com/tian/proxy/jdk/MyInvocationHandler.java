package com.tian.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author tianchengbei
 * @since 2019-12-23
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object object;

    public MyInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("调用前。。。。");
        Object returnObj = method.invoke(object, args);
        System.out.println("调用后。。。。");
        return returnObj;
    }

}
