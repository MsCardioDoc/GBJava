package Lesson6;

import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
        Wizard wizard = new Wizard("Александра", 1000);
        Knight knight = new Knight("Анатолий", 777, "Экскалибур");
        Player knight1 = new Knight("Владимир", 3000);

//        player.printInfo();
//        wizard.printInfo();
//        knight.printInfo();
//
//        wizard.doAction();
//        knight.doAction();

        Player[] players = {wizard, knight1, knight};

        for (Player player : players) {
            player.printInfo();
            player.doAction();

            if (player instanceof Knight) {
                Knight k = (Knight) player;
                k.saddleHorse();
            }
        }

        Object[] objects = new Object[]{
                new int[]{1, 2, 3},
                new Date(),
                new Scanner(System.in),
                Math.class,
                knight,
                "Hello, world"
        };

        for (Object object : objects) {
            System.out.println(object);
        }

//        System.out.println(wizard);
    }


}
