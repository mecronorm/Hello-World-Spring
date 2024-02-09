package org.example;

import components.ConfigReader;
import config.ApplicationConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        ConfigReader configReader = context.getBean(ConfigReader.class);

        String message = configReader.getHelloWorldMessage();
        System.out.println(message);
    }
}
