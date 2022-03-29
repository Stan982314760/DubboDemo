package com.stan;

import com.stan.service.HelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ConsumerApplication {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        HelloService helloService = context.getBean(HelloService.class);
        helloService.sayHello();
    }
}
