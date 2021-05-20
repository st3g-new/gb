package lesson3;

public class Task4 {
    public static void main(String[] args) {
        initTwoDimensionalArray(5);
    }

    private static void initTwoDimensionalArray(int count) {
        int[][] numbers = new int[count][count];
        System.out.println("Массив до изменения:");
        printElementsOfTwoDimensionalArray(numbers);

        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if (i == j) {
                    numbers[i][j] = 1;
                }
            }
        }
        for (int i = 0, j = count - 1; i < count && j >= 0; i++, j--) {
            numbers[i][j] = 1;
        }

        System.out.println("Массив после изменения:");
        printElementsOfTwoDimensionalArray(numbers);
    }

    private static void printElementsOfTwoDimensionalArray(int[][] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                System.out.print(numbers[i][j] + " ");
            }
            System.out.println();
        }
    }
}
