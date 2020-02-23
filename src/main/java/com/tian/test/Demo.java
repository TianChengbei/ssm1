package com.tian.test;


import javax.swing.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author tianchengbei
 * @since 2019-12-16
 */
public class Demo {

    public static int a = 0;
    static Object lock = new Object();

    public int method() {
        System.out.println();
        try {
//            throw new Exception();
            int b = 1 / 0;
        } catch (Exception e) {
            a = 1;
            return a;
        } finally {
            a = 2;
        }
        a = 3;
        return a;
    }

    public static void main(String[] args) {
//        Demo d = new Demo();
//        System.out.println(d.method());
//        System.out.println(d.a);

        AtomicInteger b = new AtomicInteger();

        Integer cc = new Integer(334);
        for (int i = 0; i < 3; i++) {
            new Thread(() -> {
                    b.getAndIncrement();

            }).start();
        }

        while (b.get() < 3) {

        }
        System.out.println(b);
    }

}
