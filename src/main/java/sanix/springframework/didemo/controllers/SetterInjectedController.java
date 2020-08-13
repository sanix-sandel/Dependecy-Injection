package sanix.springframework.didemo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import sanix.springframework.didemo.services.GreetingService;
import sanix.springframework.didemo.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {

    private GreetingService greetingService;


    public String sayHello(){
        return greetingService.sayGreeting();
    }

    @Autowired
    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

}
