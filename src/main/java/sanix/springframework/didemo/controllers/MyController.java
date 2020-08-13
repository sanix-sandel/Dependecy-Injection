package sanix.springframework.didemo.controllers;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Controller;
import sanix.springframework.didemo.services.GreetingService;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService){
        this.greetingService=greetingService;
    }

    public String hello(){
        System.out.println("hello today we'll talk about life and life!");

        return greetingService.sayGreeting();
    }
}
