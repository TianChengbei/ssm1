package com.tian.design.explain;

/**
 * @author tianchengbei
 * @since 2019-11-28
 * <p>
 * 非终结符
 */
public class NormalExpression implements Expression {

    private Expression expression1;
    private Expression expression2;

    public NormalExpression(Terminator t1,Terminator t2) {
        this.expression1 = t1;
        this.expression2 = t2;
    }

    @Override
    public int explain(Context context) {
        if(context.getSymbol().equals("+")){
            return expression1.explain(context) + expression2.explain(context);
        }
        return 0;
    }
}
