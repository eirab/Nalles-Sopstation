package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("session")
public class Game {

    private int score;

    private int level;

    private int reGenerateMoreTrash;

    //private int countSortedTrashed;

    @Autowired
    private TrashRepository repository;



    public Game(TrashRepository repository) {
        this.score = 0;
        this.repository= repository;
        this.level= 0;
        //this.countSortedTrashed = 0;
        this.reGenerateMoreTrash = 0;
    }


    public void updateScore() {
        this.score += 1;
    }


    public void generateMoreTrash() {
        do {
            this.reGenerateMoreTrash +=5;

        } while (score == 5);
    }


    public int getScore() {
        return score;
    }

    public void numberOfSortedTrash() {
        //if ( countSortedTrashed > 14);
    }

}
