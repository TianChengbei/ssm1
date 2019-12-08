package com.tian.design.strategy;

/**
 * @author tianchengbei
 * @since 2019-11-27
 */
public class OperationMultiply implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
