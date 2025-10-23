package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void sumTest() {
       assertEquals(Calculator.sum(2.0, 1.0),3);
    }

    @Test
    public void numbersNullSumTest() {
        assertThrows(NullPointerException.class, () -> Calculator.sum(null, 1.0));
    }

    @Test
    void subTest() {
       assertEquals(Calculator.sub(2.0, 1.0),1);
    }

    @Test
    void divideTest() {
              assertEquals(Calculator.divide(4.0, 2.0),2);

    }

    @Test
    public void divisionByZeroTest() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(4.0, 0.0));
    }

    @Test
    void factorialTest() {
              assertEquals(Calculator.factorial(3), 6);
    }

    @Test
    void integerToBinaryTest() {
              assertEquals(Calculator.integerToBinary(5), 101);
    }

    @Test
    void integerToHexadecimalTest() {
                     assertEquals(Calculator.integerToHexadecimal(170), "aa");

    }

    @Test
    void calculeDayBetweenDateTest() {
                     assertEquals(Calculator.calculeDayBetweenDate
                     (LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 29)), 14);
    }
}