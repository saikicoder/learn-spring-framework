package com.in28minutes.learn_spring_framework_02;

import com.in28minutes.learn_spring_framework_02.game.GameRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
        context.getBean(GameRunner.class).run();
        }
    }

}
