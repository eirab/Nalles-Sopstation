package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("session")
public class Game {

    private int score;


    public Game(){
        this.score = 0;


    }

    public void updateScore(){
        this.score += 1;



    }

    public void generateMoreTrash(){



    }


    public int getScore() {
        return score;
    }
}
