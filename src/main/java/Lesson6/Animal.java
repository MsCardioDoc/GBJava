package Lesson6;

public abstract class Animal {
    private static int animalsCount = 0;
    private String nickname;
    private int distanceRun;
    private int distanceSwim;

    public Animal(String nickname) {
        this.nickname = nickname;
        animalsCount++;
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Патриция");
        Cat cat1 = new Cat("Илона Маск");
        Dog dog = new Dog("Тони Старк");
        Dog dog1 = new Dog("Альбус");

        cat.run(200).swim(10).run(900);
        cat1.swim(70).run(1);
        dog.run(600).run(-100);
        dog1.swim(5).swim(100);

        System.out.printf("Количество животных: %s%n", animalsCount);
        System.out.printf("Количество котов: %s%n", Cat.catsCount);
        System.out.printf("Количество собак: %s%n", Dog.dogsCount);
    }

    public int getDistanceSwim() {
        return distanceSwim;
    }

    public void setDistanceSwim(int distanceSwim) {
        this.distanceSwim = distanceSwim;
    }

    public int getDistanceRun() {
        return distanceRun;
    }

    public void setDistanceRun(int distanceRun) {
        this.distanceRun = distanceRun;
    }


    public void getInfo(String nickname, int distanceRun) {
        System.out.println(this);
    }

    public Animal run(int distanceRun) {
        if (this.distanceRun <= 0) {
            System.out.printf("%s не умеет бегать%n", this.nickname);
        } else if (Math.abs(distanceRun) <= this.distanceRun) {
            System.out.printf("%s пробежал(а) - %s м%n", this.nickname, distanceRun);
        } else {
            System.out.printf("%s не может столько бегать, он(а) маленький(ая) блин!!!%n", this.nickname);
        }
        return this;
    }

    public Animal swim(int distanceSwim) {
        if (this.distanceSwim <= 0) {
            System.out.printf("%s не умеет плавать%n", this.nickname);
        } else if (Math.abs(distanceSwim) <= this.distanceSwim) {
            System.out.printf("%s проплыл(а) - %s м%n", this.nickname, distanceSwim);
        } else {
            System.out.printf("%s не может столько проплыть, он(а) маленький(ая) блин!!!%n", this.nickname);
        }
        return this;
    }
}
