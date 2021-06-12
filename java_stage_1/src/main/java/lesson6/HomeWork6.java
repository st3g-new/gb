package lesson6;

public class HomeWork6 {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal");
        animal.Run(100);
        animal.Swim(50);

        for (int i = 0; i < 10; i++) {
            System.out.println("***");
            Dog dog = new Dog("Шарик_" + i);
            dog.Swim(i * 10);
            dog.Run(i);
        }

        for (int i = 0; i < 7; i++) {
            System.out.println("---");
            Cat cat = new Cat("Гав_" + i);
            cat.Run(30 * i);
            cat.Swim(i);
        }

        System.out.printf("\nОбщее количество животных: %d. Количество кошек: %d. Количество собак: %d", Animal.count, Cat.count, Dog.count);
    }
}
