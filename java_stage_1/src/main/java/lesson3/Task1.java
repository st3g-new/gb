package lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        changeArray(new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0});
    }

    private static void changeArray(int[] numbers) {
        System.out.println("Массив до изменения: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                numbers[i] = 1;
            } else {
                numbers[i] = 0;
            }
        }
        System.out.println("Массив после изменения: " + Arrays.toString(numbers));
    }
}
