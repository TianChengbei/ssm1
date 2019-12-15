package com.tian.spring.aop.spring.aspectj;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author tianchengbei
 * @since 2019-12-14
 */
@Aspect
@Component
public class MyAspect {

    @Around("execution(* com.tian.spring.aop.spring.aspectj.UserServiceImp.*(..))")
    public void log(ProceedingJoinPoint joinPoint){
        System.out.println("注解日志前。。。。。");
        try {
            joinPoint.proceed();
            System.out.println("注解日志后。。。。");
        } catch (Throwable throwable) {
            //异常通知
            System.out.println("异常日志。。。。。");
            throwable.printStackTrace();
        }finally {
            System.out.println("注解日志最终。。。。。");
        }
    }

    @Before("execution(* com.tian.spring.aop.spring.aspectj.UserServiceImp.*(..)))")
    public void log1(){
        System.out.println("log1.....");
    }


}
