package edu.wctc.threesteptutorial;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showHomePage(){
        return "index";
    }

    @RequestMapping("/first")
    public String showStepOne(){
        return "pages/step-one";
    }

    @RequestMapping("/second")
    public String showStepTwo(){
        return "pages/step-two";
    }

    @RequestMapping("/third")
    public String showStepThree(){
        return "pages/step-three";
    }
}
