package com.example.demo;

public class Trash {

    private int trash_id;
    private String name;
    private TrashCategory category;

    public Trash(int trash_id, String name, TrashCategory category) {
        this.trash_id = trash_id;
        this.name = name;
        this.category = category;
    }

    public int getTrash_id() {
        return trash_id;
    }

    public void setTrash_id(int trash_id) {
        this.trash_id = trash_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TrashCategory getCategory() {
        return category;
    }

    public void setCategory(TrashCategory category) {
        this.category = category;
    }
}