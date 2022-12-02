package Lesson6;

public class Wizard extends Player {

    private char symbol;

    public Wizard(String nickname, int points, char symbol) {
        super(nickname, points, "Волшебник");
        this.symbol = symbol;
    }

    public Wizard(String nickname, int points) {
        super(nickname, points, "Волшебник");
    }

    Wizard(String nickname) {
        super(nickname, 100, "Волшебник");
    }

    Wizard(int points) {
        super("NoName", points, "Волшебник");
    }

    @Override
    public void doAction() {
        System.out.printf("%s Кастует заклинание %n", getNickname());

    }
}
