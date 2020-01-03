package com.tian.test.interview;

public class Test1 {

    public static void main(String[] args) {
        try {
            System.out.println(divide(0));  //b d  f g
            System.out.println("E");
        } catch (Exception e) {
            System.out.println("F");
        }
        System.out.println("G");
    }

    public static Integer divide(int i) throws Exception {
        Integer result = null;
        try {
            result = 9/i;
            System.out.println("A");
        } catch (Exception e) {
            System.out.println("B");
            throw new Exception("C");
        } finally {
            System.out.println("D");
        }
        return result;
    }

    public static void a() {
        Integer i1 = 128;
        Integer i2 = 128;
        System.out.println(i1 == i2);
        String s3 = "100";
        String s4 = "1" + new String("00");
        System.out.println(s3 == s4);
        Integer i5 = 100;
        Integer i6 = 100;
        System.out.println(i5 == i6);
    }

}
