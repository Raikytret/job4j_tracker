package ru.job4j.tracker.oop;

public class Calculator {

    private static int x = 5;

    public static int sum(int y) {
        return x + y;
    }

    public int multiply(int y) {
        return x * y;
    }

    public static int minus(int y) {
        return y - x;
    }

    public int divide(int y) {
        return y / x;
    }

    public int sumAllOperation(int x, int y, int z, int m) {
        return x + y + z + m;
    }

    public static void main(String[] args) {
        int rslSum = Calculator.sum(10);
        System.out.println(rslSum);
        Calculator calculator = new Calculator();
        int rslMultiply = calculator.multiply(5);
        System.out.println(rslMultiply);
        int rslMinus = Calculator.minus(10);
        System.out.println(rslMinus);
        int rslDivide = calculator.divide(10);
        System.out.println(rslDivide);
        int rslSumAll = calculator.sumAllOperation(rslSum, rslMinus, rslDivide, rslMultiply);
        System.out.println(rslSumAll);
    }
}