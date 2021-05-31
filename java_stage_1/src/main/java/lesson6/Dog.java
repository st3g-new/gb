package lesson6;

public class Dog extends Animal {

    private final int limitRun = 500;
    private final int limitSwim = 10;
    public static int count = 0;

    public Dog(String name) {
        super(name);
        this.count++;
    }

    @Override
    public void Swim(int a) {
        if (a > limitSwim) {
            System.out.printf("Собака '%s' не сможет проплыть %d м\n", getName(), a);
        } else {
            System.out.printf("Собака '%s' плывет %d м\n", getName(), a);
        }
    }

    @Override
    public void Run(int a) {
        if (a > limitRun) {
            System.out.printf("Собака '%s' не сможет пробежать %d м\n", getName(), a);
        } else {
            System.out.printf("Собака '%s' бежит %d м\n", getName(), a);
        }
    }
}
