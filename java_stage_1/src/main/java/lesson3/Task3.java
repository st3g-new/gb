package lesson3;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        changeArray();
    }

    private static void changeArray() {
        int[] numbers = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Массив до изменения: " + Arrays.toString(numbers));
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 6) {
                numbers[i] *= 2;
            }
        }
        System.out.println("Массив после изменения: " + Arrays.toString(numbers));
    }
}
