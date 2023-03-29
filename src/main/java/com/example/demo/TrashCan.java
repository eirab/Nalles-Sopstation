package com.example.demo;

public class TrashCan {

    private int id;

    private String name;

    private int trash_category_id;

    public TrashCan(int id, String name, int trash_category_id) {
        this.id = id;
        this.name = name;
        this.trash_category_id = trash_category_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
