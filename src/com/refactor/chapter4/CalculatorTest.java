package com.refactor.chapter4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Jim on 17/4/6.
 */
public class CalculatorTest {

    @Test
    public void evaluatesExpression() {
        Calculator calculator = new Calculator();
        int sum = calculator.evaluate("1+2+3");
        assertEquals(6, sum);
    }
}