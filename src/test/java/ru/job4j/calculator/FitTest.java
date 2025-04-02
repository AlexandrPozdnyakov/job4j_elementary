package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then72dot65() {
        short input = 180;
        double expected = 72.65;
        double output = Fit.calculateIdealWeight(input, Fit.Gender.MALE);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenWoman170Then69() {
        short input = 170;
        double expected = 69.0;
        double output = Fit.calculateIdealWeight(input, Fit.Gender.FEMALE);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenInvalidHeightThenException() {
        short invalidHeight = 300;
        assertThatThrownBy(() -> Fit.calculateIdealWeight(invalidHeight, Fit.Gender.MALE))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("Рост должен быть от 1 до 250 см");
    }
}