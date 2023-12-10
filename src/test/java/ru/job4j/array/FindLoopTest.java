package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FindLoopTest {

    @Test
    void whenArrayHas5Then0() {
        int[] array = new int[] {5, 10, 3};
        int element = 5;
        int expected = 0;
        int result = FindLoop.indexOf(array, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenArrayHasNot10ThenMinus1() {
        int[] array = new int[] {5, 15, 3, 4, 11};
        int element = 10;
        int expected = -1;
        int result = FindLoop.indexOf(array, element);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas8ThenResultEqualFinish() {
        int[] data = new int[] {5, 2, 10, 2, 4, 8, 14, 3, 21, 16};
        int element = 8;
        int start = 2;
        int finish = 5;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasSomeEqualElementThen3() {
        int[] data = new int[] {5, 10, 2, 4, 8, 4, 14, 4, 3, 21, 16};
        int element = 4;
        int start = 1;
        int finish = 8;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas2Then3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int element = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHasNot44ThenMinus1() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 44;
        int start = 2;
        int finish = 6;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenDiapasonHas7Then6() {
        int[] data = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int element = 7;
        int start = 2;
        int finish = 7;
        int result = FindLoop.indexInRange(data, element, start, finish);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }
}