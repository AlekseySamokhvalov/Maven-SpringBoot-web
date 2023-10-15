package pro.sky.springcalc.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.springcalc.TestUtils;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceParametrizedTest {

    private final CalcService calcService = new CalcServiceImpl();
    public static Stream<Arguments> plusParams(){
        return Stream.of(
                Arguments.of("2", "2", TestUtils.stringResult(2, 2, "+", String.valueOf(2+2))),
                Arguments.of("21", "9", TestUtils.stringResult(21, 9, "+",  String.valueOf(21+9))),
                Arguments.of("20", "10", TestUtils.stringResult(20, 10, "+",  String.valueOf(20+10))),
                Arguments.of("5", "25", TestUtils.stringResult(5, 25, "+",  String.valueOf(5+25)))
        );
    }
    @ParameterizedTest
    @MethodSource("plusParams")
    void calculatorPlus(int num1, int num2, String expectedResult) {
        assertEquals(expectedResult, calcService.calculatorPlus(num1, num2));
    }

    public static Stream<Arguments> minusParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "-", String.valueOf(2-2))),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "-", String.valueOf(0-8))),
                Arguments.of(4, 1, TestUtils.stringResult(4, 1, "-", String.valueOf(4-1)))
        );
    }

    @ParameterizedTest
    @MethodSource("minusParams")
    void calculatorMinus(int num1, int num2, String expectedResult) {
        assertEquals(expectedResult, calcService.calculatorMinus(num1, num2));
    }

    public static Stream<Arguments> multiplyParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, "*", String.valueOf(2*2))),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, "*", String.valueOf(0*8))),
                Arguments.of(4, 1, TestUtils.stringResult(4, 1, "*", String.valueOf(4*1)))
        );
    }

    @ParameterizedTest
    @MethodSource("multiplyParams")
    void calculatorMultiply(int num1, int num2, String expectedResult) {
        assertEquals(expectedResult, calcService.calculatorMultiply(num1, num2));
    }

    public static Stream<Arguments> divideParams() {
        return Stream.of(
                Arguments.of(2, 2, TestUtils.stringResult(2, 2, ":", String.valueOf((double)2/2))),
                Arguments.of(0, 8, TestUtils.stringResult(0, 8, ":", String.valueOf((double)0/8))),
                Arguments.of(4, 8, TestUtils.stringResult(4, 8, ":", String.valueOf((double)4/8))),
                Arguments.of(4, 3, TestUtils.stringResult(4, 3, ":", String.valueOf((double)4/3)))
        );
    }

    @ParameterizedTest
    @MethodSource("divideParams")
    void calculatorDivide(int num1, int num2, String expectedResult) {
        assertEquals(expectedResult, calcService.calculatorDivide(num1, num2));
    }
}