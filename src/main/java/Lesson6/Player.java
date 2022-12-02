package Lesson6;

public abstract class Player {
    private final String russianProfession;
    private String nickname;
    private int points;

    public Player(String nickname, int points, String russianProfession) {
        this.nickname = nickname;
        this.points = points;
        this.russianProfession = russianProfession;
    }

    public Player(String russianProfession) {
        this.russianProfession = russianProfession;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return String.format("%s %s имеет %s очков", this.russianProfession, this.nickname, this.points);
    }

    public void printInfo() {
        System.out.println(this);
    }

    public abstract void doAction();
}
