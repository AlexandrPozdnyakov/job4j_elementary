package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByPerent, boolean hasMoney) {
        if (allowByPerent && hasMoney) {
            System.out.println("I can go to the computer club.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, false);
        Games.permission(false, true);
    }
}
