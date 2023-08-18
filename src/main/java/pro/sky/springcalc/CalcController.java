package pro.sky.springcalc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalcController {
    private final CalcService calcService;
    public CalcController(CalcService calcService){
        this.calcService = calcService;
    }
//    private CalcService calcService = new CalcService();
    @GetMapping
    public String hello(){
        return calcService.hello();
    }
    @GetMapping(path = "/hello")
    public String answerHello(@RequestParam("name") String userName){
        return calcService.answerHello(userName);
    }
}
