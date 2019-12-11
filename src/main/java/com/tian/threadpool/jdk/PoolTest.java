package com.tian.threadpool.jdk;

import com.sun.xml.internal.bind.v2.model.annotation.RuntimeAnnotationReader;
import com.tian.threadpool.MyTask;
import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author tianchengbei
 * @since 2019-11-19
 */
public class PoolTest {

    public static void main(String[] args) {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,
                5,
                4,
                TimeUnit.MINUTES,
                new ArrayBlockingQueue<Runnable>(100),
                new ThreadFactory() {
                    @Override
                    public Thread newThread(Runnable r) {
                        return null;
                    }
                },
                new RejectedExecutionHandler() {
                    @Override
                    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

                    }
                });

//        executor.execute(new MyTask(12));

            getAa("dd","ded","da");
    }


    private static int getAa(String ... aa){
        for (String a : aa) {
            System.out.println(a);
        }
        Map<String,Object> map = new HashMap<>();
        map.put("13","1333");
        map.put("14","1444");
//        map.forEach((key,value) -> System.out.println(key+value));

        return 1;


    }


}
