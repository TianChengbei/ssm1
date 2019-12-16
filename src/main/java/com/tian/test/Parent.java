package com.tian.test;

class Parent {
    int i =1;
    Parent(){
        System.out.println("ppp"+i);
        int x =getValue();
        System.out.println(x);
    }
    {
        System.out.println("dddd");
        i=2;
    }
    protected int getValue(){
        System.out.println("i=="+i);
        return i;
    }
}

class Son extends Parent{
    int j=1;
    Son(){
        System.out.println("kkk");
        j=2;
    }
    {
        System.out.println("jjj");
        j=3;
    }

    @Override
    protected int getValue() {
        System.out.println("gggg"+j);
        return j;
    }

    public void tt(){

    }

}

class Test{
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.getValue());
    }
}