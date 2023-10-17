package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }
}
