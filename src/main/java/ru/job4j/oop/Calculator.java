package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int multiply(int y) {
        return x * y;
    }

    public int devide(int y) {
        return y / x;
    }

    public int sumAllOperation(int y) {
        return sum(y) + minus(y) + multiply(y) + devide(y);
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int resultSum = sum(10);
        System.out.println(resultSum);
        int resultMinus = minus(10);
        System.out.println(resultMinus);
        int resultMult = calculator.multiply(10);
        System.out.println(resultMult);
        int resultDev = calculator.devide(10);
        System.out.println(resultDev);
        System.out.println(calculator.sumAllOperation(10));
    }
}