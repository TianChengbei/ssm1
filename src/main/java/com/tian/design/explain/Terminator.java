package com.tian.design.explain;

/**
 * 终结符
 * @author tianchengbei
 * @since 2019-11-28
 */
public class Terminator implements  Expression{

    private Integer num;

    public Terminator(Integer num){
        this.num = num;
    }

    @Override
    public int explain(Context context) {
        return this.num;
    }
}
