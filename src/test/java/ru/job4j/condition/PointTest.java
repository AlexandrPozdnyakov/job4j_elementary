package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class PointTest {
    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus02to12then2() {
        double expected = 2;
        int x1 = -1;
        int y1 = 2;
        int x2 = 1;
        int y2 = 2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whenMinus12to1Minus2then4Dot47() {
        double expected = 4.472;
        int x1 = -1;
        int y1 = 2;
        int x2 = 1;
        int y2 = -2;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }

    @Test
    void whetMinus3Minus3to11then5Dot65() {
        double expected = 5.656;
        int x1 = -3;
        int y1 = -3;
        int x2 = 1;
        int y2 = 1;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.001));
    }
}