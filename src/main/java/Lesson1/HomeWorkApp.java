package Lesson1;

import java.util.concurrent.ThreadLocalRandom;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");

        System.out.println(System.lineSeparator() + "Задание 1");
        printThreeWords();

        System.out.println(System.lineSeparator() + "Задание 2");
        checkSumSign();

        System.out.println(System.lineSeparator() + "Задание 3");
        printColor();

        System.out.println(System.lineSeparator() + "Задание 4");
        compareNumbers();

        printCongratulation();
    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void checkSumSign() {
        int a = ThreadLocalRandom.current().nextInt(-128, 127);
        System.out.println("a = " + a);

        int b = ThreadLocalRandom.current().nextInt(-128, 127);
        System.out.println("b = " + b);

        System.out.println("Сумма = " + (a + b));
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = ThreadLocalRandom.current().nextInt(-100, 150);
        System.out.println("Value = " + value);

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    public static void compareNumbers() {
        int a = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println("a = " + a);

        int b = ThreadLocalRandom.current().nextInt(0, 10);
        System.out.println("b = " + b);

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void printCongratulation() {
        System.out.println("Поздравляю, вы выполнили первое домашнее задание!");
    }
}
