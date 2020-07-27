package sanix.springframework.didemo.controllers;

import sanix.springframework.didemo.services.GreetingServiceImpl;

public class PropertyInjectedController {

    public GreetingServiceImpl greetingService;

    String sayHello(){
        return greetingService.sayGreeting();
    }

    public GreetingServiceImpl getGreetingService(){
        return greetingService;
    }
}
