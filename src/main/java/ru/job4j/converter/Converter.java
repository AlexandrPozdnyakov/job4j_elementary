package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float result = value / 104.29f;
        return result;
    }

    public static float rubleToDollar(float value) {
        float result = value / 98.37f;
        return result;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = rubleToDollar(55300);
        System.out.println("55300 rubles are " + dollar + " dollar.");
    }
}
