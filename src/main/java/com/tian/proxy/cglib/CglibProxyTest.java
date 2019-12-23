package com.tian.proxy.cglib;


import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author tianchengbei
 * @since 2019-12-23
 */
public class CglibProxyTest {

    public static void main(String[] args) {
        //可以指定 CGLIB 将动态生成的代理类保存至指定的磁盘路径下
//        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"/Users/tianchengbei/word/ww");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Student.class);
        enhancer.setCallback(new MyMethodInterceptor());
        Student student = (Student)enhancer.create();
        student.speak();
        student.walk();
        student.study();
    }

}
