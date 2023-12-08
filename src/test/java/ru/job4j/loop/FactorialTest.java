package ru.job4j.loop;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.Assertions.*;

class FactorialTest {

    @Test
    void when5Then120() {
        int n = 5;
        int expected = 120;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when0Then1() {
        int n = 0;
        int expected = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when1Then1() {
        int n = 1;
        int expected = 1;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when9Then362880() {
        int n = 9;
        int expected = 362880;
        int result = Factorial.calc(n);
        assertThat(result).isEqualTo(expected);
    }
}