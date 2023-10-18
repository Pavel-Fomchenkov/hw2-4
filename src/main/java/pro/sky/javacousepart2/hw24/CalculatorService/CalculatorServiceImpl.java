package pro.sky.javacousepart2.hw24.CalculatorService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Double.parseDouble;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    private final String wrongInput = "Ошибка, заданы неверные параметры.";

    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public String summ(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        Double firstNum = convertParam(num1);
        Double secondNum = convertParam(num2);
        if (firstNum == null || secondNum == null) return wrongInput;
        double result = firstNum + secondNum;
        return num1 + " + " + num2 + " = " + result;
    }

    @Override
    public String subtr(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        Double firstNum = convertParam(num1);
        Double secondNum = convertParam(num2);
        if (firstNum == null || secondNum == null) return wrongInput;
        double result = firstNum - secondNum;
        return num1 + " - " + num2 + " = " + result;
    }

    @Override
    public String mult(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        Double firstNum = convertParam(num1);
        Double secondNum = convertParam(num2);
        if (firstNum == null || secondNum == null) return wrongInput;
        double result = firstNum * secondNum;
        return num1 + " * " + num2 + " = " + result;
    }

    @Override
    public String divide(@RequestParam(value = "num1", required = false) String num1, @RequestParam(value = "num2", required = false) String num2) {
        Double firstNum = convertParam(num1);
        Double secondNum = convertParam(num2);
        if (firstNum == null || secondNum == null) return wrongInput;
        if (secondNum == 0.0) return "Ошибка, деление на 0 запрещено.";
        double result = firstNum / secondNum;
        return num1 + " / " + num2 + " = " + result;
    }

    private Double convertParam(@RequestParam(required = false) String num) {
        if (num == null) return null;
        try {
            return parseDouble(num);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
