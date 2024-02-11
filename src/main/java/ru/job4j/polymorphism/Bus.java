package ru.job4j.polymorphism;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Поставить 1 передачу и нажать педаль акселератора.");
    }

    @Override
    public void passangers(int number) {
        System.out.println("Количесто пассажиров - " + number);
    }

    @Override
    public int fullUp(int x) {
        return Transport.super.fullUp(x);
    }
}
