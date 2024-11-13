package ru.job4j.ru.calculator;

public class CalculatorMetod {
    public static void plus(int fist, int second) {
        int result = fist + second;
        System.out.println(result);
    }

    public static void minus(int fist, int second) {
        int result = fist - second;
        System.out.println(result);
    }

    public static void main(String[] args) {
        CalculatorMetod.plus(100, 500);
        CalculatorMetod.plus(4, 2);
        CalculatorMetod.plus(3, 5);
        minus(10, 5);
        minus(28, 8);
        minus(44, 11);
    }
}
