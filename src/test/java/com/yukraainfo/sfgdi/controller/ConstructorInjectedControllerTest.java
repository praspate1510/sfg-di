package com.yukraainfo.sfgdi.controller;

import com.yukraainfo.sfgdi.services.ConstructorInjectedGreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {
    ConstructorInjectedController constructorInjectedController;
    @BeforeEach
    void setUp() {
        constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingServiceImpl());
    }

    @Test
    void testSayGreeting() {
        constructorInjectedController.sayGreeting();
    }
}