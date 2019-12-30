package com.tian.spring.aop.use;

import org.springframework.stereotype.Repository;

/**
 * @author tianchengbei
 * @since 2019-12-30
 */
@Repository
public class UserDaoImpl {

    public void addUser(String user,Integer id){
        System.out.println("add user ........"+user+"  "+id);
    }

    public void deleteUser(Integer userId){
        System.out.println("add user ........"+userId);
    }

}
