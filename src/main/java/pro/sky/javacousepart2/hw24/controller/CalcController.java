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
}
