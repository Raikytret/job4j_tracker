package ru.job4j.tracker.oop;

public class Ball {
    public void tryRun(boolean condition) {
        String escape = condition ? "Was eaten" : "Run away";
        System.out.println(escape);
    }
}
