package ru.job4j.polymorphism;

public interface Transport {

    void drive();

    void passangers(int number);

    default int fullUp(int x) {
        return x * 59;
    }
}
