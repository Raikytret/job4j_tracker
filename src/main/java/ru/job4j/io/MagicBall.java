package ru.job4j.io;

import java.util.Scanner;
import java.util.Random;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Я великий Оракул. Что ты хочешь узнать? ");
        input.nextLine();
        int answer = new Random().nextInt(3);
        String print = switch (answer) {
            case 1 -> "Да";
            case 2 -> " Нет";
            default -> "Может быть";
        };
            System.out.println(print);
    }
}