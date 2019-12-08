package com.tian.design.explain;

/**
 * @author tianchengbei
 * @since 2019-11-28
 */
public class Test {

    public static void main(String[] args) {
        Terminator t1 = new Terminator(2);
        Terminator t2 = new Terminator(4);
        NormalExpression normalExpression = new NormalExpression(t1,t2);
        System.out.println(normalExpression.explain(new Context("+")));
    }

}
