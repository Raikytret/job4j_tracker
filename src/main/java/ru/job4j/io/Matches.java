package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            System.out.println("Осталось спичек " + count);
            String player = turn ? "Первый игрок" : "Второй игрок";
            String startPhrase = count < 3 ? " введите число от 1 до " + count : " введите число от 1 до 3:";
            System.out.println(player + startPhrase);
            int matches = Integer.parseInt(input.nextLine());
            if (matches > 3  || matches < 1 || matches > count) {
                System.out.println("Некорректное значение");
            } else {
                count -= matches;
                turn = !turn;
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}