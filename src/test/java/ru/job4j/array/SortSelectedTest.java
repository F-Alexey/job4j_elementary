package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class SortSelectedTest {

    @Test
    public void when34125Sort12345() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when41And13And4Sort4And13And41() {
        int[] data = new int[] {41, 13, 4};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {4, 13, 41};
        assertThat(result).containsExactly(expected);
    }
}