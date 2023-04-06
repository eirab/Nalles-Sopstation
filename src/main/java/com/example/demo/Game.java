package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@Scope("session")
public class Game {

    private int score;

    private int level;


    private List<Trash> currentTrash;
    @Autowired
    private TrashRepository repository;
    private int trashCount;


    public Game(TrashRepository repository) {
        this.score = 0;
        this.repository= repository;
        this.level= 0;
        this.currentTrash = repository.getTrash(5);

    }


    public void updateGame(int id) {
        updateScore();
        if(score == 8){
            gameEnd();
        }
        updateCurrentTrash(id);
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

    private void gameEnd() {

    }

    private void updateTrashCount() {
        this.trashCount++;
    }



    public int getScore() {

        return score;
    }

    public void numberOfSortedTrash() {
        //if ( countSortedTrashed > 14);
    }

    public void resetScore() {
        this.score = 0;
    }

}
