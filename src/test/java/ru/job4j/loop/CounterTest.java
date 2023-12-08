package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;


class CounterTest {

    @Test
    void when0To5Then15() {
        int a = 0;
        int b = 5;
        int expected = 15;
        int result = Counter.sum(a, b);
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void when5To0Then0() {
        int a = 5;
        int b = 0;
        int expected = 0;
        int result = Counter.sum(a, b);
        assertThat(expected).isEqualTo(result);
    }

    @Test
    void when0To10Then55() {
        int a = 0;
        int b = 10;
        int expected = 55;
        int result = Counter.sum(a, b);
        assertThat(expected).isEqualTo(result);
    }
}