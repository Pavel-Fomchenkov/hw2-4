package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {
    @GetMapping
    String hello();

    @GetMapping
    String summ(String num1, String num2);

    @GetMapping
    String subtr(String num1, String num2);

    @GetMapping
    String mult(String num1, String num2);

    @GetMapping
    String divide(String num1, String num2);
}
