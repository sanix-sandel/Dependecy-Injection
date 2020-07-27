package sanix.springframework.didemo.controllers;


import org.springframework.stereotype.Controller;

@Controller
public class MyController {
    public String hello(){
        System.out.println("hello today we'll talk about life and life!");

        return "foo !";
    }
}
