package com.in28minutes.learn_spring_framework_02;

import com.in28minutes.learn_spring_framework_02.game.GameRunner;
import com.in28minutes.learn_spring_framework_02.game.GamingConsole;
import com.in28minutes.learn_spring_framework_02.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game(){
        var game = new PacManGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(){
        var gameRunner = new GameRunner(game());
        return gameRunner;
    }
 
}
