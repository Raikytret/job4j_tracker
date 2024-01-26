package ru.job4j.tracker;

import java.security.PublicKey;

public class Item {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public Item() {
    }

    public Item(String name) {
        this.name =  name;
    }

    public Item(String name, int id) {
        this.name = name;
        this.id = id;
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

    public static void main(String[] args) {
        Item item = new Item();
    }
}