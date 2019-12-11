package com.tian.spring.di.service;

import com.tian.spring.di.dao.UserDao;
import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author tianchengbei
 * @since 2019-12-10
 */
@Component
public class UserService {

    @Resource
    private UserDao userDao;

    @Value("${pp}")
    private String pwd;

    public void say(){
        System.out.println("userservice......");
        System.out.println(pwd);
        userDao.addUser();
    }

}
