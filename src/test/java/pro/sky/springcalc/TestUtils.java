package pro.sky.springcalc;

public class TestUtils {
    public static String stringResult(int num1, int num2, String action, String result) {
        return String.format("%s %s %s = %s", num1, action, num2, result);
    }
}
