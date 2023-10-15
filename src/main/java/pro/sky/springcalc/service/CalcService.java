package pro.sky.springcalc.service;

public interface CalcService {
    String calculator();
    String calculatorPlus(Integer num1, Integer num2);
    String calculatorMinus(Integer num1, Integer num2);
    String calculatorMultiply(Integer num1, Integer num2);
    String calculatorDivide(Integer num1, Integer num2);
}
