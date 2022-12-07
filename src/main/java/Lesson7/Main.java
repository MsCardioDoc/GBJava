package Lesson7;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Jerry", 5);
        catsArray[1] = new Cat("Claus", 6);
        catsArray[2] = new Cat("Bonny", 4);
        Plate plate = new Plate(0);


        plate.increaseFood(10);
        System.out.println(plate);

        for (Cat cat : catsArray) {
            if (cat.eat(plate)) {
                System.out.println(cat + " наелся");
                System.out.println(plate);
            } else {
                System.out.println(cat + " остался голодным");
            }

        }


        System.out.println(Arrays.toString(catsArray));
        System.out.println(plate);

    }
}
