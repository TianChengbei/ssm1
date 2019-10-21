package com.tian.test;

import java.util.HashMap;

public class Test1 {
    static final int MAXIMUM_CAPACITY = 1 << 30;
    public static void main(String[] args) {
        HashMap<String,Object> map = new HashMap<>();
        map.put("11","fd" );
//        map.get("");
//        String s = new String();
//        s.hashCode();
//        s.equals("");
//        System.out.println(roundUpToPowerOf2(16));
    }

    private static int roundUpToPowerOf2(int number) {
        // assert number >= 0 : "number must be non-negative";
        return number >= MAXIMUM_CAPACITY
                ? MAXIMUM_CAPACITY
                : (number > 1) ? Integer.highestOneBit((number - 1) << 1) : 1;
    }
}
