package ru.job4j.tracker.oop;

public class Ball {
    public void tryRun(boolean condition) {
        String escape = condition ? "Kilobok was eaten" : "Kolobok run away";
        System.out.println(escape);
    }
}
