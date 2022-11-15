package Lesson3;


import java.util.Arrays;

public class HomeWorkApp {


    public static void main(String[] args) {

        System.out.println(System.lineSeparator() + "Задание 1");
        invert(new int[]{1, 0, 1, 1, 1, 0, 0, 0, 0});

        System.out.println(System.lineSeparator() + "Задание 2");
        fill(new int[100]);

        System.out.println(System.lineSeparator() + "Задание 3");
        multiply(new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1});

        System.out.println(System.lineSeparator() + "Задание 4");
        squareArray(new int[7][7]);

        System.out.println(System.lineSeparator() + "Задание 5");
        int[] result = fillValue(10, -100);
        System.out.println(Arrays.toString(result));

        System.out.println(System.lineSeparator() + "Задание 6");
        System.out.println(Arrays.toString(findMinMax(new int[]{1, 5, 78, 54, 678, -78})));

        System.out.println(System.lineSeparator() + "Задание 7");
        System.out.println(findMedian(new int[]{1, 5, 78, 54, 30}));

        System.out.println(System.lineSeparator() + "Задание 8");
        int[] arr = new int[]{1, 2, 3, 4, 5};
        System.out.print(Arrays.toString(arr) + " - ");
        move(arr, 2);
        System.out.println(Arrays.toString(arr));


    }

    public static void invert(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fill(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void multiply(int[] arr) {
        System.out.print(Arrays.toString(arr) + " -> ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void squareArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] += 1;
            arr[i][(arr[i].length - 1) - i] += 1;
            System.out.println(Arrays.toString(arr[i]));
        }
    }

    public static int[] fillValue(int len, int initialValue) {
        int[] arr = new int[len];
        Arrays.fill(arr, initialValue);
        return arr;
    }

    public static int[] findMinMax(int[] arr) {
        int[] result = new int[2];
        result[0] = arr[0];
        result[1] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > result[1]) {
                result[1] = arr[i];
            } else if (arr[i] < result[0]) {
                result[0] = arr[i];
            }
        }
        return result;
    }

    public static boolean findMedian(int[] array) {
        if (array.length < 1) {
            return false;
        }
        int sum = 0;
        for (int j : array) {
            sum += j;
        }

        int left = 0;

        for (int i = 0; i < array.length; i++) {
            left += array[i];
            if (left == (sum - left)) {
                System.out.println("Середина находится между позициями " + i + " и " + (i + 1));
                return true;
            }

        }
        return false;
    }

    public static void move(int[] arr, int n) {
        for (int i = 0; i < n; i++) {
            int a = arr[0];
            int b;
            for (int j = 0; j < arr.length; j++) {
                int movePos = j + 1;
                if (movePos == arr.length) {
                    movePos = 0;
                }
                b = arr[movePos];
                arr[movePos] = a;
                a = b;
            }
        }
    }
}

