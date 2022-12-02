package Lesson6;

public class Cat extends Animal {
    public static int catsCount = 0;

    public Cat(String nickname) {
        super(nickname);
        this.setDistanceRun(200);
        this.setDistanceSwim(0);
        catsCount++;
    }
}
