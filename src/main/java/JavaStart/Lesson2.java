package JavaStart;

import java.util.Scanner;

public class Lesson2 {

    public static void main(String[] args) {
        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");
        Scanner scanner = new Scanner(System.in);
        int operation = scanner.nextInt();
        System.out.println("Введите число - a");
        int a = scanner.nextInt();
        System.out.println("Введите число - b");
        int b = scanner.nextInt();
        float result;
        if (operation == 1) {
            result = a + b;
        } else if (operation == 2) {
            result = a - b;
        } else if (operation == 3) {
            result = a * b;
        } else if (operation == 4) {
            result = (float) a / (float) b;
        } else {
            System.out.println("Операция не существует");
            return;
        }
        System.out.println("Результат = " + result);
    }
}
