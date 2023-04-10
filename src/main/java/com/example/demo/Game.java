package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
@Scope("session")
public class Game {

    private static final String LEVEL1_BACKGROUND = "url(../images/level1-background.png)";
    private static final String LEVEL2_BACKGROUND ="url(../images/level2-background.png)";
    private static final String LEVEL3_BACKGROUND ="url(../images/level3-background.png)";
    private static final String LEVEL1_GROUND = "../images/level-1-front.png";


    private int score;

    private int level;

private int[] previousTrash;
    private List<Trash> currentTrash;
    private List<Trash> allTrash;


    @Autowired
    private TrashRepository repository;
    private int totalTrashCount;



    public Game(TrashRepository repository) {
        this.score = 0;
        this.level= 1;
        this.totalTrashCount = 0;
        this.allTrash = repository.getAllTrash();
        this.currentTrash = repository.getRandomTrash(5);

    }

    private void addSorted(){

    }

    public String getBackground() {
        switch (this.level) {
            case 1:
                return LEVEL1_BACKGROUND;

            case 2:
                return LEVEL2_BACKGROUND;
            case 3: return LEVEL3_BACKGROUND;
        }

        return null;
    }

    public void updateGame(int count, int level) {
        if(count == 5){
            switch(level){
                case 1, 2, 3:
                    updateScore();
                    nextLevel();
                    currentTrash = repository.getRandomTrash(5);
                    break;
                case 4: this.score = 0;
                this.level = 1;
                currentTrash = repository.getRandomTrash(5);
                break;
            }
        } else {

            updateScore();
        }
    }



    private void nextLevel(){
        if(this.level == 4){
            this.score = 0;
            this.level = 0;
        } else {
            this.level++;
        }
    }
    private void updateCurrentTrash(int id) {
        currentTrash.remove(getTrashById(id));
        addMoreTrash();
    }
    public List<Trash> getCurrentTrash() {

        return currentTrash;
    }

    private Trash getTrashById(int id) {
        for (Trash t : currentTrash
             ) { if(t.getTrash_id() == id)
                 return t;

        }
        return null;
    }


    private void updateScore() {
        this.score += 1;
    }

    private int getNCurrentTrash(){
        return currentTrash.size();
    }


    private void addMoreTrash() {
        this.currentTrash.add(repository.getOneTrash());
    }


    public int getScore() {

        return score;
    }


    public String getGround() {
        return LEVEL1_GROUND;
    }

    public int getLevel() {
        return level;
    }

    public void restart() {
        this.level = 1;
        this.score = 0;
        this.currentTrash = repository.getRandomTrash(5);


    }
}
