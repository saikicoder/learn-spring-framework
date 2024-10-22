package com.in28minutes.learn_spring_framework_01.helloworld;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
    public static void main(String[] args) {
        // Launch a spring context
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);

        // Configure the thinghs that we want spring to manage - @Configuration
        // HelloWorldConfiguration.class

        // retrieving beans managed by spring
        System.out.println(context.getBean("name"));
        System.out.println(context.getBean("age"));
        System.out.println(context.getBean("person"));
        System.out.println(context.getBean("address2")); // Name of the bean
        System.out.println(context.getBean(Address.class)); // Type of the bean
        System.out.println(context.getBean("person3Parameters"));
        System.out.println(context.getBean("person2MethodCall"));
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

    }
}