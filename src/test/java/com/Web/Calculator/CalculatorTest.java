package com.Web.Calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("unused")
public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }

    @Test
    public void testSub() {
        assertEquals(-3, calculator.sub(3, 6));
    }

    @Test
    public void testMul() {
        assertEquals(10, calculator.mul(2, 5));
    }

    @Test
    public void testDiv() {
        assertEquals(6, calculator.div(12, 2));
    }
}
