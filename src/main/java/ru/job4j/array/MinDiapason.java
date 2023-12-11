package ru.job4j.array;

public class MinDiapason {
    public static int findMin(int[] array, int start, int finish) {
        int result = array[start];
        for (int i = start + 1; i <= finish; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }
}
