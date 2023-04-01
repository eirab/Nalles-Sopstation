package com.example.demo;

public class NewTrash {

    private int new_trash_id;
    private String name;
    private int trash_category_id;
    private String image;

    public NewTrash(int new_trash_id, String name, int trash_category_id, String image) {
        this.new_trash_id = new_trash_id;
        this.name = name;
        this.trash_category_id = trash_category_id;
        this.image = image;
    }

    public int getNew_trash_id() {
        return new_trash_id;
    }

    public void setNew_trash_id(int new_trash_id) {
        this.new_trash_id = new_trash_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTrash_category_id() {
        return trash_category_id;
    }

    public void setTrash_category_id(int trash_category_id) {
        this.trash_category_id = trash_category_id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}


