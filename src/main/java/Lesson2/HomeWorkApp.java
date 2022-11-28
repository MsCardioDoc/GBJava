package Lesson2;

public class HomeWorkApp {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        if (numbersInRange(10, 6)) {
            System.out.println("Числа в диапазоне");
        } else {
            System.out.println("Числа вне диапазона");
        }

        System.out.println(System.lineSeparator() + "Задание 2");
        printNumberSign(-2);

        System.out.println(System.lineSeparator() + "Задание 3");
        if (isNegativeNumber(10)) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число положительное");
        }

        System.out.println(System.lineSeparator() + "Задание 4");
        repeatPrint("Я два раза не повторяю", 2);

        System.out.println(System.lineSeparator() + "Задание 5");
        if (isLeapYear(2022)) {
            System.out.println("Високосный");
        } else {
            System.out.println("Не високосный");
        }
    }

    public static boolean numbersInRange(int a, int b) {
        return (a + b) > 10 && (a + b) <= 20;
    }

    public static void printNumberSign(int number) {
        System.out.printf(
                "Число %s %s" + System.lineSeparator(),
                number,
                number < 0 ? "Отрицательное" : "Положительное"
        );
    }

    public static boolean isNegativeNumber(int number) {
        return number < 0;
    }

    public static void repeatPrint(String text, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(text);
        }
    }
    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
