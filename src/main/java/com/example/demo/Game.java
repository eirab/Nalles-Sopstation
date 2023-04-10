package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Component
@Scope("session")
public class Game {

    private static final String LEVEL1_BACKGROUND = "url(../images/level1-background.png)";
    private static final String LEVEL2_BACKGROUND ="url(../images/level2-background.png)";
    private static final String LEVEL3_BACKGROUND ="url(../images/level3-background.png)";
    private final int NUMBER_OF_TRASH = 5;



    private int score;

    private int level;
    private List<Trash> currentTrash;
    private List<Trash> allTrash;


    @Autowired
    private TrashRepository repository;



    public Game(TrashRepository repository) {

        this.score = 0;
        this.level= 1;
        this.allTrash = repository.getAllTrash();
        this.currentTrash = setCurrentTrash();

    }



    private List<Trash> setCurrentTrash(){

        List<Trash> trash = new ArrayList<>();
        Collections.shuffle(allTrash);
        for (int i = 0; i < NUMBER_OF_TRASH ; i++) {
            trash.add(allTrash.get(i));

        }

        return trash;

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

    public void updateGame(int count, int level, int id) {
        removeSorted(id);
        if(count == 5){
            switch(level){
                case 1, 2, 3:
                    updateScore();
                    nextLevel();
                    currentTrash = setCurrentTrash();
                    break;
                case 4: this.score = 0;
                this.level = 1;
                currentTrash = setCurrentTrash();
                break;
            }
        } else {


            updateScore();
        }
    }

    private void removeSorted(int id){

        for (int i = 0; i < allTrash.size(); i++) {
           if(allTrash.get(i).getTrash_id() == id){
               allTrash.remove(getTrashByID(id));

           }

        }


    }

    private Trash getTrashByID(int id){


        for (Trash t : allTrash
             ) { if(t.getTrash_id() == id){
                return t;
        }

        }
        return null;
    }



    private void nextLevel(){
        if(this.level == 4){
            this.score = 0;
            this.level = 0;
        } else {
            this.level++;
        }
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





    public int getScore() {

        return score;
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
