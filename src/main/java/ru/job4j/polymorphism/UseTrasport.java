package ru.job4j.polymorphism;

public class UseTrasport {
    public static void main(String[] args) {
        Transport bus = new Bus();
        bus.drive();
        bus.passangers(12);
        System.out.println(bus.fullUp(50) + " рублей");
    }
}
