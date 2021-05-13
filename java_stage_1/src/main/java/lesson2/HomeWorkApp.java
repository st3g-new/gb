package lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        //задание 1
        System.out.println(checkSumInRange(5, 16));
        //задание 2
        printNumber(-2);
        //задание 3
        System.out.println(positiveOrNegativeNumber(-5));
        //задание 4
        printString("Тестовая строка", 2);
        //задание 5
        System.out.println(checkYear(1500));
    }

    private static boolean checkSumInRange(int a, int b) {
        if (a + b >= 10 && a + b <= 20) {
            return true;
        } else {
            return false;
        }
    }

    private static void printNumber(int a) {
        if (a >= 0) {
            System.out.printf("Число %d положительное\n", a);
        } else {
            System.out.printf("Число %d отрицательное\n", a);
        }
    }

    private static boolean positiveOrNegativeNumber(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    private static void printString(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }

    private static boolean checkYear(int year) {
        if (year % 400 == 0) {
            return true;
        }
        if (year % 100 == 0) {
            return false;
        }
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }
}
