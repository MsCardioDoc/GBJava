package Lesson6;

public class Knight extends Player {

    private String swordTitle;

    public Knight(String nickname, int points, String swordTitle) {
        super(nickname, points, "Рыцарь");
        this.swordTitle = swordTitle;
    }

    public Knight(String nickname, int points) {
        this(nickname, points, "Меч-кладенец");
    }

    public void saddleHorse() {
        System.out.printf("Рыцарь %s кричит: \"Вперед, Плотва!\"%n", super.getNickname());
    }

    public String getSwordTitle() {
        return swordTitle;
    }

    public void setSwordTitle(String swordTitle) {
        this.swordTitle = swordTitle;
    }

//    public void printInfo() {
//        super.printInfo();
//        System.out.printf("Его меч: %s%n", this.swordTitle);
//
//    }


    @Override
    public String toString() {
        return super.toString() + " " + String.format(", а его меч: %s", this.swordTitle);
    }

    @Override
    public void doAction() {
        System.out.printf("%s машет мечом %s%n", getNickname(), getSwordTitle());

    }
}
