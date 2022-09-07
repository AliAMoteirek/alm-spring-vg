package com.example.almspringvg;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculationTest {
    private Calculation calculation;
    int num1;
    int num2;

    @BeforeEach
    void setUp() {
        calculation = new Calculation();
        num1 = 4;
        num2 = 2;
    }

    @Test
    void addTwoNumbersTest() {
        // When
        int result = calculation.addTwoNumbers(num1, num2);

        //Then
        assertEquals(6,result);
    }

    @Test
    void subtractTwoNumbersTest() {
        // When
        int result = calculation.subtractTwoNumbers(num1, num2);

        //Then
        assertEquals(2,result);
    }

    @Test
    void multiplyTwoNumbers() {
        // When
        int result = calculation.multiplyTwoNumbers(num1, num2);

        //Then
        assertEquals(8 ,result);
    }

    @Test
    void multiplyByItselfTest() {
        // When
        int result = calculation.multiplyByItself(num1);

        //Then
        assertEquals(16,result);
    }
}