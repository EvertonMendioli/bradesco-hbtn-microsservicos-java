package com.example.calculator.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void sumTest() {
        Calculator calculator = new Calculator();
       assertEquals(calculator.sum(2.0, 1.0),3);
    }

    @Test
    public void numbersNullSumTest() {
                Calculator calculator = new Calculator();

        assertThrows(NullPointerException.class, () -> calculator.sum(null, 1.0));
    }

    @Test
    void subTest() {
                        Calculator calculator = new Calculator();

       assertEquals(calculator.sub(2.0, 1.0),1);
    }

    @Test
    void divideTest() {
                                Calculator calculator = new Calculator();

              assertEquals(calculator.divide(4.0, 2.0),2);

    }

    @Test
    public void divisionByZeroTest() {
                                Calculator calculator = new Calculator();

        assertThrows(ArithmeticException.class, () -> calculator.divide(4.0, 0.0));
    }

    @Test
    void factorialTest() {
                                Calculator calculator = new Calculator();

              assertEquals(calculator.factorial(3), 6);
    }

    @Test
    void integerToBinaryTest() {
                                Calculator calculator = new Calculator();

              assertEquals(calculator.integerToBinary(5), 101);
    }

    @Test
    void integerToHexadecimalTest() {
                                Calculator calculator = new Calculator();

                     assertEquals(calculator.integerToHexadecimal(170), "aa");

    }

    @Test
    void calculeDayBetweenDateTest() {
                                Calculator calculator = new Calculator();

                     assertEquals(calculator.calculeDayBetweenDate
                     (LocalDate.of(2020, 3, 15), LocalDate.of(2020, 3, 29)), 14);
    }
}