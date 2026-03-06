package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class CounterTest {
    @Test
    public void whenSumFrom0To10Then55() {
        int start = 0;
        int finish = 10;
        int expected = 55;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFrom3To8Then33() {
        int start = 3;
        int finish = 8;
        int expected = 33;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFrom1To1Then1() {
        int start = 1;
        int finish = 1;
        int expected = 1;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSumFrom11To5Then0() {
        int start = 11;
        int finish = 5;
        int expected = 0;
        int result = Counter.sum(start, finish);
        assertThat(result).isEqualTo(expected);
    }
}
