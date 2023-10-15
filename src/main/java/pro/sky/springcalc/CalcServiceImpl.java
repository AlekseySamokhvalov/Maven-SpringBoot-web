package pro.sky.springcalc;

import org.springframework.stereotype.Service;

@Service
public class CalcServiceImpl implements CalcService {
    public String calculator() {
        return "<b>Добро пожаловать в калькулятор</b>";
    }
    public String calculatorPlus(Integer num1, Integer num2) {
        return stringResult(num1, num2, String.valueOf(num1 + num2), "+"); //num1 + "+" + num2 + "=" + (num1 + num2);
    }
    public String calculatorMinus(Integer num1, Integer num2) {

        return stringResult(num1, num2, String.valueOf(num1 - num2), "-"); //num1 + "-" + num2 + "=" + (num1 - num2);
    }
    public String calculatorMultiply(Integer num1, Integer num2) {
        return stringResult(num1, num2, String.valueOf(num1 * num2), "*"); //num1 + "*" + num2 + "=" + (num1 * num2);
    }
    public String calculatorDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new IllegalStateException("На ноль делить нельзя!"); //return "ОШИБКА!! На ноль делить нельзя";
        } else {
            double res = (double) num1 / num2;
            return stringResult(num1, num2, String.valueOf(res), ":"); // num1 + "/" + num2 + "=" + res;
        }
    }
    private String stringResult(int num1, int num2, String result, String action) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }
}
