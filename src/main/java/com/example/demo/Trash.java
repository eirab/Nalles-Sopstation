package com.example.demo;

public class Trash {

    private int trash_id;
    private int trash_category_id;
    private String image;



    public Trash(int trash_id, int trash_category_id, String image) {
        this.trash_id = trash_id;
        this.trash_category_id = trash_category_id;
        this.image = image;
    }

    public int getTrash_id() {
        return trash_id;
    }

    public void setTrash_id(int trash_id) {
        this.trash_id = trash_id;
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