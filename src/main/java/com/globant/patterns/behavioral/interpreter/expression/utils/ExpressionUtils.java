package com.globant.patterns.behavioral.interpreter.expression.utils;

import com.globant.patterns.behavioral.interpreter.expression.Expression;
import com.globant.patterns.behavioral.interpreter.expression.impl.Add;
import com.globant.patterns.behavioral.interpreter.expression.impl.Product;
import com.globant.patterns.behavioral.interpreter.expression.impl.Substract;

public class ExpressionUtils {

    public static boolean isOperator(String s) {
        if (s.equals("+") || s.equals("-") || s.equals("*")) {
            return true;
        } else {
            return false;
        }
    }

    public static Expression getOperator(String s, Expression left, Expression right) {
        switch (s) {
            case "+":
                return new Add(left, right);
            case "-":
                return new Substract(left, right);
            case "*":
                return new Product(left, right);
        }
        return null;
    }

}
