package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 *
 */

@Component
@Scope("session")
public class Game {

    private int score;
    @Autowired
    private TrashRepository repository;



    public Game(TrashRepository repository) {
        this.score = 0;
        this.repository= repository;
    }


    public void updateScore() {
        this.score += 1;
    }


    public void generateMoreTrash() {

    }


    public int getScore() {
        return score;
    }

    public void numberOfSortedTrash() {


    }

}
