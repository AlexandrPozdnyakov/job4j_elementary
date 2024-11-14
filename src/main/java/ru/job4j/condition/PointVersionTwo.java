package ru.job4j.condition;

public class PointVersionTwo {
    public static double distance(int x1, int y1, int x2, int y2) {
        int dx = x2 - x1;
        int dy = y2 - y1;
        double dxSquared = Math.pow(dx, 2);
        double dySquared = Math.pow(dy, 2);
        double sumDxDySquared = dxSquared + dySquared;
        return Math.sqrt(sumDxDySquared);
    }

    public static void main(String[] args) {
        double result1 = distance(0, 0, 2, 0);
        double result2 = distance(1, 1, 2, 2);
        double result3 = distance(2, 2, 6, 3);
        System.out.println("result (0, 0) to (2, 0) " + result1);
        System.out.println("result (1, 1) to (2, 2) " + result2);
        System.out.println("result (2, 2) to (6, 3) " + result3);
    }
}
