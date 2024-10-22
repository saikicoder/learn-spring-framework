package com.in28minutes.learn_spring_framework_01.helloworld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

record Person(String name, int age, Address address){};
record Address(String firstLine, String city){};
@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Iamsai";
    }


    @Bean
    public int age(){
        return 15;
    }

    @Bean
    public Person person(){
        var person = new Person("Sai", 25, new Address("Main Street", "Milton"));
        return person;
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(), age(), address());
    }

    @Bean
    public Person person3Parameters(String name, int age, Address address5Qualifier){
        return new Person(name, age, address5Qualifier);
    }

    @Bean(name="address2")
    @Primary
    public Address address(){
        return new Address("Bakers Street", "London");
    }

    @Bean(name="address3")
    public Address address3(){
        return new Address("Hyderabad", "TG");
    }

    @Bean(name="address5")
    @Qualifier("address5Qualifier")
    public Address address5(){
        return new Address("Hyderabad", "TG");
    }
}
