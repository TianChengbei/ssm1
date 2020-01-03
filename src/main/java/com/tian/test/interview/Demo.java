package com.tian.test.interview;

public class Demo {
    class Super{
        int flag = 1;

        Super(){
            System.out.println("super");
            test();
        }
        {
            System.out.println("super 后");
        }
        void test(){
            System.out.println("super.test flag->"+flag);
        }
    }
    class Sub extends Super{
        Sub(int i){
            flag = i;
            System.out.println("sub.flag->"+flag);
        }
        {
            System.out.println("sub 后");
        }
        void test(){
            System.out.println("sub.test flag->"+flag);
        }
    }

    public static void main(String[] args) {
        new Demo().new Sub(6);
    }

}
