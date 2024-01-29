package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        return "Неизвестное слово. " + eng;
    }

    public static void main(String[] args) {
        DummyDic dummy = new DummyDic();
        String say = dummy.engToRus("Unknown word");
        System.out.println(say);
    }
}