package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new  String[100500];
        float[] price = new float[40];
        String[] name = new String[4];
        name[0] = "Al Po";
        name[1] = "Ale Poz";
        name[2] = "A P";
        name[3] = "Po Al";
        System.out.println("Размер массива равен " + ages.length);
        System.out.println("Размер массива равен " + surnames.length);
        System.out.println("Размер массива равен " + price.length);
        System.out.println("Имя и фамили под номером 0 - " + name[0]);
        System.out.println("Имя и фамили под номером 1 - " + name[1]);
        System.out.println("Имя и фамили под номером 2 - " + name[2]);
        System.out.println("Имя и фамили под номером 3 - " + name[3]);
    }
}
