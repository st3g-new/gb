package lesson7;

public class Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public void decreaseFood(int n) {
        food -= n;
    }

    public void enlargeFood(int n) {
        food += n;
    }

    public void info() {
        System.out.println("Количество еды на тарелке: " + food);
    }

    public int getFood() {
        return food;
    }
}