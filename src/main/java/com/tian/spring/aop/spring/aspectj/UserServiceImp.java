package com.tian.spring.aop.spring.aspectj;

import org.springframework.stereotype.Service;

/**
 * @author tianchengbei
 * @since 2019-12-14
 */
@Service
public class UserServiceImp {


    public void addUser(String name){
        System.out.println("adduser.......");
    }


}
