package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int i = 0;
        int j = array.length - 1;
        int[] result = new int[2];
        while (i != array.length - 1) {
            if (array[i] + array[j] == target) {
                result[0] = i;
                result[1] = j;
                return result;
            }
            if (i == j) {
                i++;
                j = array.length - 1;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}
