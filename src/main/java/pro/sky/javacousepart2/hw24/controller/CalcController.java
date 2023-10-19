package pro.sky.javacousepart2.hw24.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.javacousepart2.hw24.CalculatorService.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalculatorService calculatorService;

    public CalcController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping
    public String greetings() {
        return calculatorService.hello();
    }

    @GetMapping("/plus")
    public String summ(String num1, String num2) {
        return calculatorService.summ(num1, num2);
    }

    @GetMapping("/minus")
    public String subtr(String num1, String num2) {
        return calculatorService.subtr(num1, num2);
    }

    @GetMapping("/multiply")
    public String mult(String num1, String num2) {
        return calculatorService.mult(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(String num1, String num2) {
        return calculatorService.divide(num1, num2);
    }
}
