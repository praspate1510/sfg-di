package com.yukraainfo.sfgdi.controller;
import com.yukraainfo.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Qualifier;

@Controller
public class ConstructorInjectedController {
    public final GreetingService greetingService;

    public ConstructorInjectedController(@Qualifier("constructorInjectedGreetingServiceImpl") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }
}
