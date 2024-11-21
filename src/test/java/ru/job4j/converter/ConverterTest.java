package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvertor140RblThenEuro() {
        float input = 140;
        float expected = 1.3424106f;
        float output = Converter.rubleToEuro(input);
        float value = 0.0001f;
        assertThat(output)
                .withFailMessage("Некорректное значение при конвертации рублей в евро: ожидалось %f, по факту %f", expected, output)
                .isEqualTo(expected, withPrecision(value));
    }

    @Test
    void whenConvertor140RblThenDollar() {
        float input = 140;
        float excepted = 1.4231981f;
        float output = Converter.rubleToDollar(input);
        float value = 0.0001f;
        assertThat(output)
                .withFailMessage("Некорректное значение при конвертации рублей в доллары: ожидалось %f, по факту %f", excepted, output)
                .isEqualTo(excepted, withPrecision(value));
    }
}