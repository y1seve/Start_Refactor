package com.refactor.chapter4;

/**
 * Created by Jim on 17/4/6.
 */
public class Calculator {
    public int evaluate(String expression) {
        int sum = 0;
        for (String command : expression.split("\\+")) {
            sum += Integer.valueOf(command);
        }
        return sum;
    }

}
