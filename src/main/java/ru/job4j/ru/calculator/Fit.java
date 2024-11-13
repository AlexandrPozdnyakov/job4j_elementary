package ru.job4j.ru.calculator;

public class Fit {
    public static double manWeight(short heightMan) {
        double result = Math.pow(heightMan / 100.0, 2) * 21.745 + 2.2;
        return result;
    }

    public static double womanWeight(short heightWoman) {
        double result = (heightWoman - 110) * 1.15;
        return result;
    }

    public static void main(String[] args) {
        short heightMan = 180;
        short heightWoman = 170;
        double man = manWeight(heightMan);
        double woman = womanWeight(heightWoman);
        System.out.println("Man is 180 - " + man + " kg");
        System.out.println("Woman is 170 - " + woman + " kg");
    }
}
