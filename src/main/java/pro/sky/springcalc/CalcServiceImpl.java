package pro.sky.springcalc;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }    public String calculatorPlus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "+" + num2 + "=" + (num1 + num2);
        }
    }
    public String calculatorMinus(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "-" + num2 + "=" + (num1 - num2);
        }
    }
    public String calculatorMultiply(Integer num1, Integer num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else {
            return num1 + "*" + num2 + "=" + (num1 * num2);
        }
    }
    public String calculatorDivide(Double num1, Double num2) {
        if (num1 == null || num2 == null) {
            return "ОШИБКА!! Введены не все данные";
        } else if (num2 == 0) {
            return "ОШИБКА!! На ноль делить нельзя";
        } else {
            double res = (double) num1 / num2;
            return num1 + "/" + num2 + "=" + res;
        }
    }
}
