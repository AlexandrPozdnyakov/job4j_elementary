package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static void main(String[] args) {
        int fistMax = Max.max(23, 13);
        int secondMax = Max.max(11, 10);
        System.out.println(fistMax);
        System.out.println(secondMax);
    }
}