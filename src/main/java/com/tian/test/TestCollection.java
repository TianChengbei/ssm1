package com.tian.test;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;
import javax.sound.midi.Soundbank;

/**
 * @author tianchengbei
 * @since 2019-12-15
 */
public class TestCollection {

    static int a = 3;

    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
//        list.add("11");
//        list.add("22");
//        list.add("33");
//        list.remove("");
//        list.remove(3);
//        for(String s : list){
//            System.out.println(s);
//            if(s.equals("33")) list.remove(s);
//        }
//        System.out.println("-----------------");
//        list.get(2);
//        LinkedList<String> llist = new LinkedList<>();
//        llist.add("");
//        llist.get(21);
        HashSet<String> set = new HashSet<>();
        Vector<String> v = new Vector<>();
        System.out.println("ssss");
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("name","tianchengbei");
        hashMap.put("name","wan");
        hashMap.get("");
        ConcurrentHashMap<String,Object> ch = new ConcurrentHashMap<>();
        ch.put("","");
        ch.get("");
        System.out.println(15 >> 1);
        System.out.println(16>>>1);
        int b =a ;
    }

}
