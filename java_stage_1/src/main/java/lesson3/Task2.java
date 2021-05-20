package lesson3;

import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        initArray(100);
    }

    private static void initArray(int lenght) {
        int[] numbers = new int[lenght];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        System.out.println("Массив длинной: " + lenght);
        System.out.println(Arrays.toString(numbers));
    }
}
