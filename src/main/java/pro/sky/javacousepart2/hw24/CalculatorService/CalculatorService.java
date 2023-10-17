package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestPart;

public interface CalculatorService {
    @GetMapping
    String hello();
    @GetMapping
    String summ(int num1, int num2);

    @GetMapping
    String subtr(int num1, int num2);

}
