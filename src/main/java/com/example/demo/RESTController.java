package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class RESTController {

    @Autowired
    private Game game;



    @GetMapping(value = "/correctlySorted/{count}/{level}/{id}" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Message correctlySorted(@PathVariable int count, @PathVariable int level, @PathVariable int id) {


        game.updateGame(count, level, id);



        Message score = new Message(String.valueOf(game.getScore()));
        return score;
    }


    @GetMapping(value = "/incorrectlySorted", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message incorrectlySorted() {
        //What should happen when the trash is incorrectly sorted?

        Message data = new Message("Wrong trash can, try again!");
        return data;

    }

    @GetMapping(value= "/restartGame", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message restartGame(){
        game.restart();

        Message data = new Message(String.valueOf(game.getScore()), String.valueOf(game.getLevel()));


        return data;
    }


    public class Message {

        private String message;
        private String message2;


        public Message(String message) {

            this.message = message;
        }

        public Message(String message1, String message2){
            this.message = message1;
            this.message2 = message2;
        }


        public String getMessage() {

            return message;
        }

        public void setMessage(String message) {

            this.message = message;
        }

        public String getMessage2() {
            return message2;
        }

        public void setMessage2(String message2) {
            this.message2 = message2;
        }
    }

}
