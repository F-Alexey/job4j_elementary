package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class TurnTest {

    @Test
    void when1234Then4321() {
        int[] array = new int[] {1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1};
        int[] result = Turn.back(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when12345Then54321() {
        int[] array = new int[] {1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1};
        int[] result = Turn.back(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1Then1() {
        int[] array = new int[] {1};
        int[] expected = new int[] {1};
        int[] result = Turn.back(array);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when12Then21() {
        int[] array = new int[] {1, 2};
        int[] expected = new int[] {2, 1};
        int[] result = Turn.back(array);
        assertThat(result).isEqualTo(expected);
    }
}