package pro.sky.springcalc;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }
    @RequestMapping(path = "/calculator")
    public String calculator() {
        return calcService.calculator();
    }
    @RequestMapping(path = "/calculator/plus")
    public String calculatorPlus(@RequestParam (required = false) Integer num1, Integer num2) {
        return calcService.calculatorPlus(num1,num2);
    }
    @RequestMapping(path = "/calculator/minus")
    public String calculatorMinus(@RequestParam (required = false) Integer num1, Integer num2) {
        return calcService.calculatorMinus (num1,num2);
    }
    @RequestMapping(path = "/calculator/multiply")
    public String calculatorMultiply(@RequestParam (required = false) Integer num1, Integer num2) {
        return calcService.calculatorMultiply(num1,num2);
    }
    @RequestMapping(path = "/calculator/divide")
    public String calculatorDivide(@RequestParam (required = false) Double num1, Double num2) {
        return calcService.calculatorDivide(num1,num2);
    }
}
