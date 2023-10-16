package pro.sky.springcalc.service;

import org.junit.jupiter.api.Test;
import pro.sky.springcalc.TestUtils;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceTest {
    private final CalcService calcService = new CalcServiceImpl();

    @Test
    void calculator_success() {
        //подготовка ожидаемого результата
        String expectedMessage = "Добро пожаловать в калькулятор!";

        //начало теста
        String actualMessage = calcService.calculator();
        assertEquals(expectedMessage, actualMessage);
    }

    @Test
    void plus_shouldReturnPositiveNumWhenNum1AndNum2ArePositive() {
        //подготовка входных данных
        int num1 = 1;
        int num2 = 8;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "+", String.valueOf(num1 + num2));

        //начало теста
        String actualResult = calcService.calculatorPlus(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void plus_shouldReturnPositiveNumberIfNum1IsGreaterThanNum2() {
        //подготовка входных данных
        int num1 = - 100;
        int num2 = 80;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "+", String.valueOf(num1 + num2));

        //начало теста
        String actualResult = calcService.calculatorPlus(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void minus_shouldReturnPositiveNumberIfNum1IsGreaterThanNum2() {
        //подготовка входных данных
        int num1 = 13;
        int num2 = 8;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "-", String.valueOf(num1 - num2));

        //начало теста
        String actualResult = calcService.calculatorMinus(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void minus_shouldReturnPositiveNumberIfNum2IsLessThanNum1() {
        //подготовка входных данных
        int num1 = 130;
        int num2 = - 80;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "-", String.valueOf(num1 - num2));

        //начало теста
        String actualResult = calcService.calculatorMinus(num1,num2);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    void Multiply_shouldReturnPositiveNumberIfNum1AndNum2ArePositive() {
        //подготовка входных данных
        int num1 = 10;
        int num2 = 8;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "*", String.valueOf(num1 * num2));

        //начало теста
        String actualResult = calcService.calculatorMultiply(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void Multiply_mustReturnNegativeNumberIfNum1AndNum2AreDifferent() {
        //подготовка входных данных
        int num1 = - 10;
        int num2 = 8;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, "*", String.valueOf(num1 * num2));

        //начало теста
        String actualResult = calcService.calculatorMultiply(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void Divide_success() {
        //подготовка входных данных
        int num1 = 33;
        int num2 = 8;

        //подготовка ожидаемого результата
        String expectedResult = TestUtils.stringResult(num1, num2, ":", String.valueOf((double) num1 / num2));

        //начало теста
        String actualResult = calcService.calculatorDivide(num1,num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    void Divide_withException() {
        //подготовка входных данных
        int num1 = 14;
        int num2 = 0;

        //подготовка ожидаемого результата
        String expectedMessage = "На ноль делить нельзя!";

        //начало теста
        Exception exception = assertThrows(IllegalStateException.class,
                () -> calcService.calculatorDivide(num1, num2));
        assertEquals(expectedMessage, exception.getMessage());
    }
}