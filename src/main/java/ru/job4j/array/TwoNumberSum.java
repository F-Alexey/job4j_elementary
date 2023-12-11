package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = 1;
        int[] result = new int[2];
        while (i < array.length) {
            if (i == array.length - 1) {
                break;
            }
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            } else {
                j++;
            }
            if (j == array.length) {
                i++;
                j = i + 1;
            }
        }
        return new int[0];
    }
}
