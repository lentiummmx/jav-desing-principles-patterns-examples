package com.globant.patterns.behavioral.interpreter;

import com.globant.patterns.behavioral.interpreter.expression.Expression;
import com.globant.patterns.behavioral.interpreter.expression.impl.Number;
import com.globant.patterns.behavioral.interpreter.expression.utils.ExpressionUtils;

import java.util.Stack;

public class TestInterpreterPattern {
    public static void main(String[] args) {
        String tokenString = "7 3 - 2 1 + *";
        Stack<Expression> stack = new Stack<>();
        String[] tokenArray = tokenString.split(" ");
        for (String s : tokenArray) {
            if (ExpressionUtils.isOperator(s)) {
                Expression rightExpression = stack.pop();
                Expression leftExpression = stack.pop();
                Expression operator = ExpressionUtils.getOperator(s, leftExpression, rightExpression);
                int result = operator.interpret();
                stack.push(new Number(result));
            } else {
                Expression num = new Number(Integer.parseInt(s));
                stack.push(num);
            }
        }
        System.out.println("( " + tokenString + " ): " + stack.pop().interpret());
    }
}
