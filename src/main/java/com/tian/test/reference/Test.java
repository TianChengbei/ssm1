package com.tian.test.reference;

import java.lang.ref.PhantomReference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * @author tianchengbei
 * @since 2019-12-16
 * <p>
 * 参考https://blog.csdn.net/qq_39192827/article/details/85611873
 */
public class Test {

    public static void main(String[] args) {
        //软引用
        testSoftReferen();
        //弱引用
        testWeakeference();
        //虚引用
        testPhantomReference();
    }

    public static void all() {
        //强引用
        Test test = new Test();
        //弱引用
        SoftReference<Test> soft = new SoftReference<>(test);
        //软引用
        WeakReference<Test> weakReference = new WeakReference<>(test);
        //虚引用
        ReferenceQueue<Test> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Test> phantomReference = new PhantomReference<>(test, referenceQueue);
    }

    public static void testStrongRefence(){
        System.out.println("强引用。。。。。。。");
        Test test = new Test();
    }

    public static void testSoftReferen() {
        System.out.println("软引用。。。。。。。");
        Test test = new Test();
        SoftReference<Test> soft = new SoftReference<>(test);
        test = null;
        System.out.println("gc前-" + soft.get());
        System.gc();
        System.out.println("gc后-" + soft.get());
        System.out.println("--------------------");
    }

    public static void testWeakeference() {
        System.out.println("弱引用。。。。。。。");
        Test test = new Test();
        WeakReference<Test> weakReference = new WeakReference<>(test);
        test = null;
        System.out.println("gc前-" + weakReference.get());
        System.gc();
        System.out.println("gc后-" + weakReference.get());
        System.out.println("--------------------");
    }

    public static void testPhantomReference() {
        System.out.println("虚引用。。。。。。。");
        Test test = new Test();
        ReferenceQueue<Test> referenceQueue = new ReferenceQueue<>();
        PhantomReference<Test> phantomReference = new PhantomReference<>(test, referenceQueue);
        System.out.println(phantomReference.get());
        test = null;
        System.out.println("gc前-" + phantomReference.get());
        System.gc();
        System.out.println("gc后-" + phantomReference.get());
        System.out.println("--------------------");
    }


}
