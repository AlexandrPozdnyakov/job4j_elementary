package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMuptiplay(double fist, double second) {
        return sum(fist, second)
                + multiplay(fist, second);
    }

    public static double sumDifferenceAndDivision(double fist, double second) {
        return difference(fist, second)
                + division(fist, second);
    }

    public static double sumFourOperations(double fist, double second) {
        return sum(fist, second)
                + multiplay(fist, second)
                + difference(fist, second)
                + division(fist, second);
    }

    public static void main(String[] args) {
        System.out.println("Расчёт SumAndMuptiplay = " + sumAndMuptiplay(5, 10));
        System.out.println("Расчёт sumDifferenceAndDivision = " + sumDifferenceAndDivision(30, 10));
        System.out.println("Расчёт sumFourOperations = " + sumFourOperations(10, 10));
    }
}
