package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    void whenMax1To2Then2() {
        int left = 1;
        int right = 2;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(2);
    }

    @Test
    void whenMax5To3Then5() {
        int left = 5;
        int right = 3;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(5);
    }

    @Test
    void whenMax4To8Then8() {
        int left = 4;
        int right = 8;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(8);
    }

    @Test
    void whenMax10To10Then10() {
        int left = 10;
        int right = 10;
        int result = Max.max(left, right);
        assertThat(result).isEqualTo(10);
    }
}
