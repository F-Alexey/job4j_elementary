package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        Max max = new Max();
        int expected = 2;
        assertThat(max.max(1, 2)).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3Then3() {
        Max max = new Max();
        int expected = 3;
        assertThat(max.max(1, 2, 3)).isEqualTo(expected);
    }

    @Test
    void whenMax1To2To3To4Then4() {
        Max max = new Max();
        int expected = 4;
        assertThat(max.max(1, 2, 3, 4)).isEqualTo(expected);
    }
}