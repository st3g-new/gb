package lesson6;

public class Cat extends Animal {
    private final int limitRun = 200;
    public static int count = 0;

    public Cat(String name) {
        super(name);
        this.count++;
    }

    @Override
    public void Run(int a) {
        if (a > limitRun) {
            System.out.printf("Кошка '%s' не сможет пробежать %d м\n", getName(), a);
        } else {
            System.out.printf("Кошка '%s' бежит %d м\n", getName(), a);
        }
    }

    @Override
    public void Swim(int a) {
        System.out.printf("Кошка '%s' не умеет плавать\n", getName());
    }
}
