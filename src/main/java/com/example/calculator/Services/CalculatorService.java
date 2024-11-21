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
}
