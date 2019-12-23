package com.tian.spring.aop.spring.advisor;

import com.tian.spring.aop.spring.service.impl.PersonImpl;
import org.springframework.aop.ClassFilter;

/**
 * @author tianchengbei
 * @since 2019-12-04
 */
public class MyClassFilter implements ClassFilter {
    @Override
    public boolean matches(Class<?> aClass) {
        if(aClass == PersonImpl.class){
            return true;
        }
        return false;
    }
}
