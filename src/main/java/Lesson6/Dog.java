package Lesson6;

public class Dog extends Animal {
    public static int dogsCount = 0;

    public Dog(String nickname) {
        super(nickname);
        this.setDistanceRun(500);
        this.setDistanceSwim(10);
        dogsCount++;
    }
}
