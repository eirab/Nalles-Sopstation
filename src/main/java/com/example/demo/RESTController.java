package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class RESTController {

    @Autowired
    private Game game;


    @GetMapping(value = "/correctlySorted" , produces = MediaType.APPLICATION_JSON_VALUE)
    public Message correctlySorted(@RequestParam int id) {
        game.updateGame(id);


        Message score = new Message(String.valueOf(game.getScore()));
        return score;
    }

    @GetMapping(value = "/incorrectlySorted", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message incorrectlySorted() {
        //What should happen when the trash is incorrectly sorted?

        Message data = new Message("Wrong trash can, try again!");
        return data;

    }


    public class Message {

        private String message;

        public Message(String message) {
            this.message = message;
        }


        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

}
