package com.tian.design.strategy;

/**
 * @author tianchengbei
 * @since 2019-11-27
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public int operation(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }


}
