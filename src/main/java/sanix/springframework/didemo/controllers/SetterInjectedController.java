package sanix.springframework.didemo.controllers;

import sanix.springframework.didemo.services.GreetingService;
import sanix.springframework.didemo.services.GreetingServiceImpl;

public class SetterInjectedController {

    private GreetingService greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public void setGreetingService(GreetingService greetingService){
        this.greetingService=greetingService;
    }

}
