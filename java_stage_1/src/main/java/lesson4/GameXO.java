package lesson4;

import java.util.Random;
import java.util.Scanner;

public class GameXO {
    public static int SIZE = 3;
    public static int DOTS_TO_WIN = 3;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static int humanX;
    public static int humanY;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();


    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        sc.close();
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symbol) {
        if (getCountSymbolInLeftDiagonal(symbol) == DOTS_TO_WIN
                || getCountSymbolInRightDiagonal(symbol) == DOTS_TO_WIN) {
            return true;
        }

        for (int i = 0; i < SIZE; i++) {
            if (getCountSymbolInRow(i, symbol) == DOTS_TO_WIN) {
                return true;
            }
            if (getCountSymbolInColumn(i, symbol) == DOTS_TO_WIN) {
                return true;
            }
        }
        return false;
    }

    private static int getCountSymbolInRow(int rowNum, char symbol) {
        int countSym = 0;
        for (int j = 0; j < SIZE; j++) {
            if (map[rowNum][j] == symbol) {
                countSym++;
            }
        }
        return countSym;
    }

    private static int getCountSymbolInColumn(int colNum, char symbol) {
        int countSym = 0;
        for (int j = 0; j < SIZE; j++) {
            if (map[j][colNum] == symbol) {
                countSym++;
            }
        }
        return countSym;
    }

    private static int getCountSymbolInLeftDiagonal(char symbol) {
        int countSym = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][i] == symbol) {
                countSym++;
            }
        }
        return countSym;
    }

    private static int getCountSymbolInRightDiagonal(char symbol) {
        int countSym = 0;
        for (int i = 0; i < SIZE; i++) {
            if (map[i][SIZE - i - 1] == symbol) {
                countSym++;
            }
        }
        return countSym;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY)
                    return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        do {
            sc = new Scanner(System.in);
            System.out.println("Введите координаты в формате X Y");
            humanX = sc.hasNextInt() ? sc.nextInt() - 1 : -1;
            humanY = sc.hasNextInt() ? sc.nextInt() - 1 : -1;
        } while (!isCellValid(humanX, humanY));
        map[humanY][humanX] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
            return false;
        }
        if (map[y][x] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}