package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Collections;

@Controller
@Scope("session")
public class ViewController {
    @Autowired
    private TrashRepository trashRepository;

    @Autowired
    private TrashCanRepository trashCanRepository;



    @Autowired
    private Game game;


    @GetMapping("/")
    public String start(Model model) {
        return "index";
    }

    @GetMapping("/spel")
    public String getGameplaySite(Model model) {

        /*Lista med all trash som finns i databasen: */
        ArrayList<Trash> allTrash = (ArrayList<Trash>) trashRepository.getTrash();

        /*Blandar om listan så att trashet ligger huller om buller: */
        Collections.shuffle(allTrash);

        /*Ny lista samt en for-loop som lägger in 5 stycken trash i den nya listan*/
        ArrayList<Trash> fiveTrash = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            fiveTrash.add(allTrash.get(i));
        }


        model.addAttribute("trashArray", fiveTrash);
        model.addAttribute("trashCanArray",trashCanRepository.getTrashCans());

        return "game";
    }


    @GetMapping("/vinst")
    public String getWinSite() {

        return "win";
    }


    @GetMapping("/level2")
    public String getLevel2(Model model) {
        /*Lista med all trash som finns i databasen: */
        ArrayList<Trash> allTrash = (ArrayList<Trash>) trashRepository.getTrash();

        /*Blandar om listan så att trashet ligger huller om buller: */
        Collections.shuffle(allTrash);

        /*Ny lista samt en for-loop som lägger in 5 stycken trash i den nya listan*/
        ArrayList<Trash> fiveTrash = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            fiveTrash.add(allTrash.get(i));
        }


        model.addAttribute("trashArray", fiveTrash);
        model.addAttribute("trashCanArray",trashCanRepository.getTrashCans());

        return "level2";
    }


    @GetMapping("/level1")
    public String level1(Model model) {

        ArrayList<Trash> allTrash = (ArrayList<Trash>) trashRepository.getTrash();
        Collections.shuffle(allTrash);

        ArrayList<Trash> fiveTrash = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            fiveTrash.add(allTrash.get(i));
        }


        model.addAttribute("trashArray", fiveTrash);
        model.addAttribute("trashCanArray",trashCanRepository.getTrashCans());

        return "level1";
    }
}

