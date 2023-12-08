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

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFourToFifteenThen648() {
        int start = 4;
        int finish = 50;
        int result = Counter.sumByEven(start, finish);
        int expected = 648;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromTwoToTwoThenTwo() {
        int start = 2;
        int finish = 2;
        int result = Counter.sumByEven(start, finish);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromFifteenToZeroThenZero() {
        int start = 50;
        int finish = 0;
        int result = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusFourToSixThenSix() {
        int start = -4;
        int finish = 6;
        int result = Counter.sumByEven(start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}