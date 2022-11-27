package Lesson4;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static final String HEADER_FIRST_SYMBOL = "#";
    public static final String SPACE_MAP_SYMBOL = " ";
    private static final char DOT_HUMAN = 'X';
    private static final char DOT_EMPTY = '_';
    private static final char DOT_AI = 'O';
    private static final Scanner in = new Scanner(System.in);
    private static final Random random = new Random();
    private static int size;
    private static int lastRowNumber;
    private static int lastColumnNumber;
    private static int winSize;

    private static char[][] MAP = new char[size][size];
    private static int turnsCount = 0;

    public static void start() {
        do {
            System.out.println("\n\nИгра начинается!!!");
            init();

            printMap();

            playGame();
        } while (isContinueGame());
    }

    private static boolean isContinueGame() {
        System.out.println("Хотите продолжить? y\\n");
        return switch (in.next()) {
            case "y", "да" -> true;
            default -> false;
        };
    }

    private static void init() {
        turnsCount = 0;
        size = getSizeFromUser();
        winSize = getWinSize();
        initMap();
    }

    private static int getWinSize() {
        if (size >= 3 && size <= 6) {
            return 3;
        } else if (size > 6 && size <= 10) {
            return 4;
        }
        return 5;
    }

    private static int getSizeFromUser() {
        System.out.print("Введите размер игрового поля: ");
        return in.nextInt();
    }


    private static void initMap() {

        MAP = new char[size][size];

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                MAP[i][j] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        printHeaderMap();
        printBodyMap();
    }

    private static void printBodyMap() {
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
            for (int j = 0; j < size; j++) {
                System.out.print(MAP[i][j] + SPACE_MAP_SYMBOL);
            }
            System.out.println();
        }
    }

    private static void printMapNumber(int i) {
        System.out.print((i + 1) + SPACE_MAP_SYMBOL);
    }

    private static void printHeaderMap() {
        System.out.print(HEADER_FIRST_SYMBOL + SPACE_MAP_SYMBOL);
        for (int i = 0; i < size; i++) {
            printMapNumber(i);
        }
        System.out.println();
    }

    private static void playGame() {
        while (true) {
            humanTurn();
            printMap();
            if (checkEnd(DOT_HUMAN)) {
                break;
            }

            aiTurn();
            printMap();
            if (checkEnd(DOT_AI)) {
                break;
            }
        }
    }


    private static void humanTurn() {
        System.out.println("\nХод человека!");
        int rowNumber;
        int columnNumber;

        while (true) {
            System.out.print("Введите координату строки: ");
            rowNumber = in.nextInt() - 1;

            System.out.print("Введите координату столбца: ");
            columnNumber = in.nextInt() - 1;

            if (isCellFree(rowNumber, columnNumber)) {
                break;
            }

            System.out.printf("Ошибка! Ячейка с координатами %s:%s уже используется", rowNumber + 1, columnNumber + 1);
            System.out.println();
        }

        MAP[rowNumber][columnNumber] = DOT_HUMAN;
        lastRowNumber = rowNumber;
        lastColumnNumber = columnNumber;
        turnsCount++;
    }

    private static void aiTurn() {
        System.out.println("\nХод компьютера!");
        int rowNumber;
        int columnNumber;

        do {
            rowNumber = random.nextInt(size);
            columnNumber = random.nextInt(size);
        } while (!isCellFree(rowNumber, columnNumber));

        MAP[rowNumber][columnNumber] = DOT_AI;
        lastRowNumber = rowNumber;
        lastColumnNumber = columnNumber;
        turnsCount++;
    }

    private static boolean isCellFree(int rowNumber, int columnNumber) {
        return MAP[rowNumber][columnNumber] == DOT_EMPTY;

    }

    private static boolean checkEnd(char symbol) {
        if (checkWin()) {
            if (symbol == DOT_HUMAN) {
                System.out.println("Ура вы победили!");
            } else {
                System.out.println("Восстание близко...");
            }
            return true;
        }

        if (checkDrow()) {
            System.out.println("Ничья!");
            return true;
        }

        return false;
    }

    private static boolean checkDrow() {
//        for (char[] chars : MAP) {
//            for (char symbol : chars) {
//                if (symbol == DOT_EMPTY) {
//                    return false;
//                }
//            }
//
//        }
//        return true;

        return turnsCount >= size * size;


    }

    private static boolean checkWin() {
        char symbol = MAP[lastRowNumber][lastColumnNumber];
        int rowWin = 0;
        int columnWin = 0;
        int firstDiagWin = 0;
        int secondDiagWin = 0;

        for (int i = 0; i < size; i++) {
            rowWin++;
            columnWin++;
            firstDiagWin++;
            secondDiagWin++;

            if (MAP[lastRowNumber][i] != symbol) {
                rowWin = 0;
            }
            if (MAP[i][lastColumnNumber] != symbol) {
                columnWin = 0;
            }
            if (MAP[i][i] != symbol) {
                firstDiagWin = 0;
            }
            if (MAP[i][size - 1 - i] != symbol) {
                secondDiagWin = 0;
            }

            if (rowWin >= winSize
                    || columnWin >= winSize
                    || firstDiagWin >= winSize
                    || secondDiagWin >= winSize) {
                return true;
            }
        }

        return false;
    }

}
