package com.in28minutes.learn_spring_framework_02.game;
public interface GamingConsole{
    void up();
    void down();
    void right();
    void left();
    default void go(){
        System.out.println("Non abstract class");
    }
    
}