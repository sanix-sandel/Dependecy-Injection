package sanix.springframework.didemo.controllers;

import org.springframework.stereotype.Controller;
import sanix.springframework.didemo.services.GreetingService;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }


    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
