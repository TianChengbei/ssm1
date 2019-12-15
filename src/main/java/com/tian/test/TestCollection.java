package com.tian.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import javax.sound.midi.Soundbank;

/**
 * @author tianchengbei
 * @since 2019-12-15
 */
public class TestCollection {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("11");
        list.add("22");
        list.add("33");
//        list.remove("");
//        list.remove(3);
        for(String s : list){
            System.out.println(s);
            if(s.equals("33")) list.remove(s);
        }
        System.out.println("-----------------");
//        list.get(2);
        LinkedList<String> llist = new LinkedList<>();
        llist.add("");
//        llist.get(21);
        HashMap<String,Object> hashMap = new HashMap<>();
        hashMap.put("","");
        hashMap.get("");
        System.out.println(15 >> 1);




    }

}
