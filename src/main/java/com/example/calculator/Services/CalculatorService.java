package com.example.calculator.Services;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    public double addNums(double firstNum, double secondNum) {
        return firstNum + secondNum;
    }

    public double subtractNums(double firstNum, double secondNum) {
        return firstNum - secondNum;
    }

    public double multiplyNums(double firstNum, double secondNum) {
        return firstNum * secondNum;
    }

    public double divideNums(double firstNum, double secondNum) {
        if(secondNum == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return firstNum / secondNum;
    }

    public double squareNum(double number) {
        return Math.pow(number, 2);
    }

    public double squareRootNum(double number) {
        if(number < 0) {
            throw new IllegalArgumentException("Square root of a negative number is not defined.");
        }
        return Math.sqrt(number);
    }

    public double powerNum(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    public double logNum(double number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Logarithm is not defined for non-positive numbers.");
        }
        return Math.log(number); // Natural log (base e)
    }

    public double sinNum(double angle) {
        return Math.sin(Math.toRadians(angle));
    }

    public double cosNum(double angle) {
        return Math.cos(Math.toRadians(angle));
    }

    public double tanNum(double angle) {
        return Math.tan(Math.toRadians(angle));
    }
}
