package ru.job4j;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class StartUI {

    public static void main(String[] args) {
        Item item = new Item();
        LocalDateTime a = item.getCreated();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        System.out.println(a.format(formatter));
    }
}
