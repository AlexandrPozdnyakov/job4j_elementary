package ru.job4j.calculator;

public class Fit {
    private static final double CM_TO_M = 100.0;
    private static final double MALE_COEFFICIENT = 21.745;
    private static final double MALE_ADJUSTMENT = 2.2;
    private static final double FEMALE_BASE_HEIGHT = 110;
    private static final double FEMALE_MULTIPLIER = 1.15;

    public enum Gender {
        MALE {
            @Override
            public double calculateWeight(short height) {
                return Math.pow(height / CM_TO_M, 2) * MALE_COEFFICIENT + MALE_ADJUSTMENT;
            }
        },
        FEMALE {
            @Override
            public double calculateWeight(short height) {
                return (height - FEMALE_BASE_HEIGHT) * FEMALE_MULTIPLIER;
            }
        };

        public abstract double calculateWeight(short height);
    }

    public static double calculateIdealWeight(short height, Gender gender) {
        validateHeight(height);
        return gender.calculateWeight(height);
    }

    private static void validateHeight(short height) {
        if (height <= 0 || height > 250) {
            throw new IllegalArgumentException("Рост должен быть от 1 до 250 см");
        }
    }

    public static void main(String[] args) {
        short manHeight = 180;
        short womanHeight = 170;

        System.out.printf("Мужчина %d см: %.1f кг%n",
                manHeight, calculateIdealWeight(manHeight, Gender.MALE));
        System.out.printf("Женщина %d см: %.1f кг%n",
                womanHeight, calculateIdealWeight(womanHeight, Gender.FEMALE));
    }
}