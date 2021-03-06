package ru.georgeee.android.gcalc.calc.expression.real;

import ru.georgeee.android.gcalc.calc.expression.Expression;
import ru.georgeee.android.gcalc.calc.number.GRealNumber;

/**
 * Created with IntelliJ IDEA.
 * User: georgeee
 * Date: 05.10.13
 * Time: 3:10
 * To change this template use File | Settings | File Templates.
 */
public class Sqrt extends RealUnaryOperator {
    public Sqrt(Expression operand) {
        super(operand);
    }

    @Override
    public GRealNumber evaluate() {
        return ((GRealNumber) operand.evaluate()).sqrt();
    }
}
