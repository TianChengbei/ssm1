package com.tian.test;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/**
 * @author tianchengbei
 * @since 2019-12-16
 */
public class So {

    public static void main(String[] args) {
        So so = new So();
        Method[] methods = so.getClass().getMethods();
        for(Method method : methods){
            System.out.println("3333-"+method.getName());
            Class<?>[] parameterTypes = method.getParameterTypes();
            for(Class parametertype : parameterTypes){
                String name = parametertype.getName();
                System.out.print(name +"->" + parametertype+" ");
            }
            System.out.println("------");
        }
    }

    public int say(String name,String pwd){
        return 1;
    }

}
