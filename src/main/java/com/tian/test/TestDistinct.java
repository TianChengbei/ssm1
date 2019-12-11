package com.tian.test;

import com.tian.test.model.User;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * @author tianchengbei
 * @since 2019-12-04
 */
public class TestDistinct {

    public static void main(String[] args) {

        User user1 = new User(1l,"wang",23);
        User user2 = new User(1l,"liu",24);
        User user3 = new User(1l,"wang",25);

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

//        List<Object> collect = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);
//        HashMap<User,Object> map = new HashMap<>();
//        map.put(user1,"user1");
//        map.put(user2,"user2");
//        HashSet<User> set = new HashSet<>();
//        set.add(user1);
//        set.add(user2);


    }


}
