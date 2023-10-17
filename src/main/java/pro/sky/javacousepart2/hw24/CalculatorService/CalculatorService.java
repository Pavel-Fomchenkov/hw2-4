package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.web.bind.annotation.GetMapping;

public interface CalculatorService {
    @GetMapping
    String hello();
}
