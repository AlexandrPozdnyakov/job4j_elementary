package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double resualt = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return resualt;
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(1, 1, 2, 2);
        double result3 = distance(2, 2, 6, 3);
        System.out.printf("result (0, 0) to (2, 0) - %.1f%n ", result1);
        System.out.printf("result (1, 2) to (2, 2) - %.1f%n ", result2);
        System.out.printf("result (5, 2) to (6, 3) - %.1f%n ", result3);
    }
}
