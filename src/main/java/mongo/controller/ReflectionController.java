package main.java.mongo.controller;

import main.java.mongo.model.User;
import main.java.mongo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
public class ReflectionController {


    @Autowired
    private UserService userService;


@RequestMapping("/reflection-example")
    public ModelAndView  reflectionView(){


    List<User> users=userService.getUserList();


   /* String method="";
    Class ornekSinif = ReflectionController.class;
    Method[] methods = ornekSinif.getDeclaredMethods();
    for (int i = 0; i < methods.length; i++){
        method +="<h3>********** "+methods[i].toString()+"  **********</h3><br><br>";
    }*/
    String method="";
    for (User user:users){
        method +="<h3>********** "+user.getUsername()+" / "+user.getPassword()+"    **********</h3><br><br>";
    }


    String message = "<br><div style='text-align:center;'>"
            + " "+method+" </div><br><br>";
    return new ModelAndView("hello", "message", message);

    }

}
