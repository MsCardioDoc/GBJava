package Lesson7;

public class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public void decreaseFood(int food) {
        this.food -= food;
    }

    public void increaseFood(int food) {
        this.food += food;
    }

    @Override
    public String toString() {
        return "Plate[" + this.food + "]";
    }
}
