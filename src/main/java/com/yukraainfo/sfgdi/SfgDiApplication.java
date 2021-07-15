package com.yukraainfo.sfgdi;

import com.yukraainfo.sfgdi.controller.ConstructorInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.yukraainfo.sfgdi.controller.GreetingController;
@SpringBootApplication
public class SfgDiApplication {
    public static void main(String[] args) {

        ApplicationContext appContext = SpringApplication.run(SfgDiApplication.class, args);
        GreetingController greetingController = (GreetingController)appContext.getBean("greetingController");
        System.out.println("Say greeting : " + greetingController.greeting());

        ConstructorInjectedController cic = (ConstructorInjectedController)appContext.getBean("constructorInjectedController");
        System.out.println("Say greeting : " + cic.sayGreeting());
        }
}
