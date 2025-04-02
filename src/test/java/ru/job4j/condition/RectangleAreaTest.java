package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class RectangleAreaTest {

    @Test
    void whenP6K2Square2() {
        int excepted = 2;
        int p = 6;
        double k = 2;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP7K4Square1Dot95() {
        double excepted = 1.959;
        int p = 7;
        double k = 4;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }

    @Test
    void whenP3K3Dot5Square0Dot38() {
        double excepted = 0.388;
        int p = 3;
        double k = 3.5;
        double output = RectangleArea.square(p, k);
        assertThat(output).isEqualTo(excepted, withPrecision(0.01));
    }
}