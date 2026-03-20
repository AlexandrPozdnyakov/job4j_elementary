package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void whenSort3Elements() {
        int[] data = {3, 1, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSort5Elements() {
        int[] data = {5, 3, 1, 4, 2};
        int[] result = SortSelected.sort(data);
        int[] expected = {1, 2, 3, 4, 5};
        assertThat(result).isEqualTo(expected);
    }
}