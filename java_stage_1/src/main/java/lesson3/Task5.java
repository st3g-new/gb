package lesson3;

import java.util.Arrays;

public class Task5 {
    public static void main(String[] args) {
        initArray(6, 32);
    }

    private static void initArray(int len, int initialValue) {
        int[] numbers = new int[len];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = initialValue;
        }
        System.out.println("Массив после заполнения: " + Arrays.toString(numbers));
    }
}
