package com.example.calculator.Controller;

import com.example.calculator.Services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/calculator")
public class CalculatorController {

    @Autowired
    public CalculatorService _calculatorService;

    @GetMapping("/sum")
    public ResponseEntity<?> addNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double numA = Double.parseDouble(firstNum);
            double numB = Double.parseDouble(secondNum);
            double result = _calculatorService.addNums(numA, numB);
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/difference")
    public ResponseEntity<?> subtractNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double numA = Double.parseDouble(firstNum);
            double numB = Double.parseDouble(secondNum);
            double result = _calculatorService.subtractNums(numA, numB);
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/product")
    public ResponseEntity<?> multiplyNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double numA = Double.parseDouble(firstNum);
            double numB = Double.parseDouble(secondNum);
            double result = _calculatorService.multiplyNums(numA, numB);
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/quotient")
    public ResponseEntity<?> divideNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double numA = Double.parseDouble(firstNum);
            double numB = Double.parseDouble(secondNum);
            double result = _calculatorService.divideNums(numA, numB);
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }
}