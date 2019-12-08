package com.tian.design.strategy;

/**
 * @author tianchengbei
 * @since 2019-11-27
 */
public class StrategyTest {

    public static void main(String[] args) {

        Context context1 = new Context(new OperationAdd());
        System.out.println("1 + 3 = " + context1.operation(1, 3));

        context1 = new Context(new OperationSubstract());
        System.out.println("1 - 3 = " + context1.operation(1,3));

        context1 = new Context(new OperationMultiply());
        System.out.println("1 * 3 = " + context1.operation(1,3));
    }

}
