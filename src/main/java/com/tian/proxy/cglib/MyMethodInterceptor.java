package com.tian.proxy.cglib;

import java.lang.reflect.Method;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/**
 * @author tianchengbei
 * @since 2019-12-23
 */
public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("before:"+method);
        Object returnObject = methodProxy.invokeSuper(o, objects);
        System.out.println("after:"+method);
        return returnObject;
    }
}
