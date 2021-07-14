package lesson2;

import lesson2.exceptions.MyArrayDataException;
import lesson2.exceptions.MyArraySizeException;

public class Main {
    public static void main(String[] args) {
        String[][] arr =
                {
                        {"1", "2", "3", "4"},
                        {"5", "6", "7", "8"},
                        {"9", "10", "11", "12"},
                        {"13", "14", "15", "16"}
                };
        try {
            method(arr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }

    private static void method(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length != 4) {
            throw new MyArraySizeException("Входной массив должен иметь 4 строки");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) {
                throw new MyArraySizeException("Входной массив должен иметь 4 столбца");
            } else {
                for (int j = 0; j < arr[i].length; j++) {
                    try {
                        Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException("В позиции [" + i + "," + j + "] не удалось преобразовать значение в int");
                    }
                }
            }
        }
    }
}
