package lesson3;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        maxAndMinValueInArray();
    }

	//что закомментировано - это как я решил задание
    private static void maxAndMinValueInArray() {
        int[] numbers = {1, -4, 3, 55, -13, 123, 0, 5};
        System.out.println("Массив: " + Arrays.toString(numbers));
        int min = numbers[0]; //int min = Integer.MAX_VALUE;
        int max = numbers[0]; //int max = Integer.MIN_VALUE;
        for (int i = 1/*i = 0*/; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.printf("Максимальное значение: %d, минимальное значение: %d", max, min);
    }
}
