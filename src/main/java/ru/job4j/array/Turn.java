package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int len = array.length - 1;
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[len - i];
            array[len - i] = temp;
        }
        return array;
    }
}
