package com.tian.spring.aop.use;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author tianchengbei
 * @since 2019-12-30
 */
@Component
@Aspect
public class UserLog {

    @Before(value = "execution(* com.tian.spring.aop.use.UserDaoImpl.addUser(..)) && args(user,id)" )
    public void before(String user,Integer id){
        System.out.println("before log......"+user+"  "+id);
    }


}
