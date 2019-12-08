package com.tian.spring.aop.spring.advisor;

import java.lang.reflect.Method;
import org.springframework.aop.MethodMatcher;

/**
 * @author tianchengbei
 * @since 2019-12-04
 */
public class MyMethodMatcher implements MethodMatcher {
    @Override
    public boolean matches(Method method, Class<?> aClass) {
        String methodName = method.getName();
        if(methodName.equals("eat")){
            return true;
        }
        return false;
    }

    @Override
    public boolean isRuntime() {
        return false;
    }

    @Override
    public boolean matches(Method method, Class<?> aClass, Object[] objects) {
        return false;
    }
}
