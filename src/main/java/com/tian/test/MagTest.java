package com.tian.test;

import sun.swing.plaf.synth.DefaultSynthStyle;

public class MagTest {

    public static void main(String[] args) {
        maginFunction();
    }
    static MagTest st = new MagTest();
    static {
        System.out.println("1");
    }
    {
        System.out.println("2");
    }
    MagTest(){
        System.out.println("3");
        System.out.println("a="+a + ",b="+b);
    }
    public static void maginFunction(){
        System.out.println("4");
    }
    int a = 110;
    static int b =112;
}
