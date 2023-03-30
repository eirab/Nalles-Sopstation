package com.example.demo;


import org.springframework.context.annotation.Scope;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Scope("session")
public class RESTController {

    private Game game = new Game();


    @GetMapping(value = "/updateScore", produces = MediaType.APPLICATION_JSON_VALUE)
    public Message updateScore(Model model){

        String oldScore = String.valueOf(game.getScore());
        game.updateScore();
        Message score = new Message(String.valueOf(game.getScore()));

      return score;
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
