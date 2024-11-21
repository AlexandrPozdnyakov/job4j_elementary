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

        float inputRuble = 140;
        float expectedEuro = 1.3424106f;
        float outputEuro = rubleToEuro(inputRuble);
        boolean passedEuro = expectedEuro == outputEuro;
        System.out.println("140 rubles are 1.3424106 euro. Test result: " + passedEuro);
        float expectedDollar = 1.4231981f;
        float outputDollar = rubleToDollar(inputRuble);
        boolean passedDollar = expectedDollar == outputDollar;
        System.out.println("140 rubles are 1.4231981 dollar. Test result: " + passedDollar);
    }
}
