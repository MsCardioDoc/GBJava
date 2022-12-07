package Lesson7;

public class Cat {

    private String name;
    private int appetite;
    private boolean full = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    // если коту удалось поесть то true иначе false
    public boolean eat(Plate plate) {
        if (!checkFood(plate)) {
//            System.out.println(this + ": еды не хватает, мне грустно!");
            return false;
        }

//        System.out.println(this + " приготовился к трапезе");
        plate.decreaseFood(appetite);
        full = true;
//        System.out.println(this + " сьел " + appetite + " единиц еды");

        return true;
    }

    public boolean checkFood(Plate plate) {
        return appetite <= plate.getFood();
    }


    @Override
    public String toString() {
        return name;
    }
}

