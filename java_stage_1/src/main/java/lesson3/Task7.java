package lesson3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        System.out.println(checkBalance(new int[]{2, 2, 2, 1, 2, 2, 1, 1,10, 1}));
    }

    private static boolean checkBalance(int[] num) {
        System.out.println(Arrays.toString(num));

        if (num.length - 1 == 0)
            return false;

        int count = 2, sumLeft = num[0], sumRight = num[num.length - 1]; // count - количество задействованных элементов массива
        for (int i = 0, j = num.length - 1; i < num.length - 1 && j > 0; ) {
            if (count < num.length) {
                if (sumLeft > sumRight) {
                    j--;
                    count++;
                    sumRight += num[j];
                } else if (sumLeft < sumRight) {
                    i++;
                    count++;
                    sumLeft += num[i];
                } else {
                    i++;
                    count++;
                    sumLeft += num[i];
                }
            } else if (count == num.length && sumLeft == sumRight) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }
}
