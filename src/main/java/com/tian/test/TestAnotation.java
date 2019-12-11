package com.tian.test;

import java.lang.annotation.Annotation;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * @author tianchengbei
 * @since 2019-12-10
 */
@Component("TestAnotation...")
public class TestAnotation {

    public static void main(String[] args) {
        Class<TestAnotation> clazz = TestAnotation.class;
        Annotation[] annotations = clazz.getAnnotations();
        for(Annotation a : annotations){
            System.out.println(a);
        }


    }

}
