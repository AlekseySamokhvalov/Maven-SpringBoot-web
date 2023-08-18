package pro.sky.springcalc;

import org.springframework.stereotype.Service;

@Service
public class CalcService {
    public String hello(){
        return "hello";
    }

    public String answerHello(String userName){
        return "<b>hello</b> " + userName;
    }
}
