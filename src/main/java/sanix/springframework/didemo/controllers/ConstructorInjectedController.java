package sanix.springframework.didemo.controllers;

import sanix.springframework.didemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService){
        this.greetingService=greetingService;
    }


    String sayHello(){
        return greetingService.sayGreeting();
    }
}
