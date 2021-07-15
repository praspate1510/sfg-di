package com.yukraainfo.sfgdi.controller;
import com.yukraainfo.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {
    @Qualifier("propertyInjectedGreetingServiceImpl")
    @Autowired
    public GreetingService greetingService;

    public String sayGreeting() {
        return greetingService.sayGreeting();
    }

}
