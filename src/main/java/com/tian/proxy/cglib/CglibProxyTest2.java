package com.tian.proxy.cglib;


import com.tian.proxy.jdk.Person;
import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;

/**
 * @author tianchengbei
 * @since 2019-12-23
 */
public class CglibProxyTest2 {

    public static void main(String[] args) {
        //可以指定 CGLIB 将动态生成的代理类保存至指定的磁盘路径下
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY,"d:/ww");
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(InterfaceO.class);
        enhancer.setCallback(new MyMethodInterceptor());
        InterfaceO person = (InterfaceO)enhancer.create();
        person.test();
    }

}
