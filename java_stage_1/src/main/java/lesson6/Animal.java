package lesson6;

public class Animal {
    private String name;
    public static int count = 0;

    public Animal(String name) {
        this.name = name;
        this.count++;
    }

    public void Swim(int a) {
        System.out.printf("Животное '%s' плывет %d м\n", name, a);
    }

    public void Run(int a) {
        System.out.printf("Животное '%s' бежит %d м\n", name, a);
    }

    public String getName() {
        return name;
    }
}
