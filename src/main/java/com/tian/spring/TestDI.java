package com.tian.spring;

import com.tian.spring.model.BeanScope;
import com.tian.spring.model.Teacher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author tianchengbei
 * @since 2019-12-01
 */
public class TestDI {

    public static void main(String[] args) throws Exception {
        BeanDefine beanTeacher = new BeanDefine();
        beanTeacher.setId("teacher");
        beanTeacher.setClassPath("com.tian.spring.model.Teacher");
        beanTeacher.setScope(BeanScope.singleton);
        Map<String,String> map = new HashMap<>();
        map.put("name","李田坝");
        map.put("friend","tianergou,王宝强,李云飞");
        map.put("school","北京理工大学,北京大学");
        beanTeacher.setPropertityMap(map);


        List<BeanDefine> list = new ArrayList<>();
        list.add(beanTeacher);

        BeanFactory factory = new BeanFactory(list);

        Teacher teacher = (Teacher) factory.getBean("teacher");
        System.out.println(teacher);

    }

}
