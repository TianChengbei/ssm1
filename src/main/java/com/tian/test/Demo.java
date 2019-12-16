package com.tian.test;

/**
 * @author tianchengbei
 * @since 2019-12-16
 */
public class Demo {

    public int a = 0;
    public int method(){
        System.out.println();
        try {
//            throw new Exception();
            int b = 1 /0;
        } catch (Exception e){
            a = 1;
            return a;
        }finally {
            a=2;
        }
        a = 3;
        return a;
    }

    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.method());
        System.out.println(d.a);
    }

}
