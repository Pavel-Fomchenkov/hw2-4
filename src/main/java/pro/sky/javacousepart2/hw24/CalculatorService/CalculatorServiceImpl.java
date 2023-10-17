package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String summ(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 + num2 + "";
    }
    @Override
    public String subtr(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return num1 - num2 + "";
    }

}
