package com.tian.test;

/**
 * @author tianchengbei
 * @since 2019-12-09
 */
public class TestFinally {
    /**
     * javap -c TestFinally.class
     * @param args
     */
    public static void main(String[] args) {
        System.out.println(inta());
        synchronized (TestFinally.class) {
            System.out.println("aaaa");
        }
    }

    public static int inta() {
        int a;
        try {
            a = 1;
            a++;
            System.out.println("a="+a);
            return a;
        } catch (Exception e) {
        } finally {
            a=3;

        }
        return a;
    }

}
