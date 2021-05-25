package lesson3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        shiftArrayElement(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, -1648);
    }

    private static void shiftArrayElement(int[] numbers, int n) {
        System.out.println("Число, на которое нужно сдвинуть элементы массива: " + n);
        int len = numbers.length;
        n = n - (n / len) * len;
        int[] result = new int[len];
        System.out.println("Массив до преобразований: " + Arrays.toString(numbers));

        if (n == 0) {
            printResult(numbers, n);
        }
        if (n > 0) {
            for (int i = 0; i < len; i++) {
                int j = (i + n) < len ? i + n : (i + n) % len;
                result[j] = numbers[i];
            }
            printResult(result, n);
        }
        if (n < 0) {
            for (int i = 0; i < len; i++) {
                int j = len + i + n < len ? len + i + n : (len + i + n) % len;
                result[j] = numbers[i];
            }
            printResult(result, n);
        }
    }

    private static void printResult(int[] num, int n) {
        if (n < 0) {
            System.out.printf("Сдвиг на %d влево.\nРезультат: %s", n, Arrays.toString(num));
        } else if (n > 0) {
            System.out.printf("Сдвиг на %d вправо.\nРезультат: %s", n, Arrays.toString(num));
        } else {
            System.out.printf("Число кратно длине массива %d.\nРезультат: %s", num.length, Arrays.toString(num));
        }
    }
}
