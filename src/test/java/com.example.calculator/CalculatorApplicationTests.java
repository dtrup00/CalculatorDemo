package com.example.calculator;

import static org.junit.jupiter.api.Assertions.*;

import com.example.calculator.Services.CalculatorService;
import org.junit.jupiter.api.Test;

public class CalculatorApplicationTests {

    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void testAdd() {
        assertEquals(15.0, calculatorService.addNums(10, 5));
    }

    @Test
    void testSubtract() {
        assertEquals(5.0, calculatorService.subtractNums(10, 5));
    }

    @Test
    void testMultiply() {
        assertEquals(50.0, calculatorService.multiplyNums(10, 5));
    }

    @Test
    void testDivide() {
        assertEquals(2.0, calculatorService.divideNums(10, 5));
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculatorService.divideNums(10, 0);
        });

        String expectedMessage = "Division by zero is not allowed.";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }
}
