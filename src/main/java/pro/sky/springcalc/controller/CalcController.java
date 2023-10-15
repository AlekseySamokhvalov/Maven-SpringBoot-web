package pro.sky.springcalc.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.springcalc.service.CalcService;

@RestController
@RequestMapping("/calculator")
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }
    @RequestMapping(path = "/")
    public String calculator() {
        return calcService.calculator();
    }
    @RequestMapping(path = "/plus")
    public String calculatorPlus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calcService.calculatorPlus(num1,num2);
    }
    @RequestMapping(path = "/minus")
    public String calculatorMinus(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calcService.calculatorMinus (num1,num2);
    }
    @RequestMapping(path = "/multiply")
    public String calculatorMultiply(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calcService.calculatorMultiply(num1,num2);
    }
    @RequestMapping(path = "/divide")
    public String calculatorDivide(@RequestParam Integer num1, @RequestParam Integer num2) {
        return calcService.calculatorDivide(num1,num2);
    }
}


