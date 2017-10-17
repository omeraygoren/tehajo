package main.java.mongo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HelloWorld {
    @RequestMapping("/hello")
    public ModelAndView helloWorld() {

        String message = "<br><div style='text-align:center;'>"
                + "<h3>********** Hello World Example ************</h3>" +
                "******** Merhaba **********</div><br><br>";
        return new ModelAndView("hello", "message", message);
    }
}
