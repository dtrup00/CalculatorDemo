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
            double result = _calculatorService.addNums(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/difference")
    public ResponseEntity<?> subtractNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double result = _calculatorService.subtractNums(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/product")
    public ResponseEntity<?> multiplyNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double result = _calculatorService.multiplyNums(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/quotient")
    public ResponseEntity<?> divideNumbers(@RequestParam String firstNum, @RequestParam String secondNum) {
        try {
            double result = _calculatorService.divideNums(Double.parseDouble(firstNum), Double.parseDouble(secondNum));
            return ResponseEntity.ok(result);
        }
        catch (Exception ex) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid numbers.");
        }
    }

    @GetMapping("/square")
    public ResponseEntity<?> squareNumber(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.squareNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception ex) {
            return ResponseEntity.badRequest().body("");
        }
    }

    @GetMapping("/squareRoot")
    public ResponseEntity<?> squareRootNumber(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.squareRootNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid number.");
        }
    }

    @GetMapping("/power")
    public ResponseEntity<?> powerNum(@RequestParam String baseNum, @RequestParam String expNum) {
        try {
            double result = _calculatorService.powerNum(Double.parseDouble(baseNum), Double.parseDouble(expNum));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("");
        }
    }

    @GetMapping("/logarithm")
    public ResponseEntity<?> logNum(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.logNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid number.");
        }
    }

    @GetMapping("/sin")
    public ResponseEntity<?> sinNum(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.sinNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid number.");
        }
    }

    @GetMapping("/cos")
    public ResponseEntity<?> cosNum(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.cosNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid number.");
        }
    }

    @GetMapping("/tan")
    public ResponseEntity<?> tanNum(@RequestParam String numberParam) {
        try {
            double result = _calculatorService.tanNum(Double.parseDouble(numberParam));
            return ResponseEntity.ok(result);
        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Invalid input: Please provide valid number.");
        }
    }


}