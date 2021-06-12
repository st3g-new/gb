package lesson7;

public class MainClass {
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.info();
        Cat[] catsArray = new Cat[]{
                new Cat("Барсик", 20),
                new Cat("Мурзик", 35),
                new Cat("Шарик", 40),
                new Cat("Васька", 20)
        };

        System.out.println("Выпускаем кошек");

        feedProcess(catsArray, plate);

        System.out.println("Добавим еды");
        plate.enlargeFood(15);
        plate.info();

        feedProcess(catsArray, plate);
    }

    public static  void feedProcess(Cat[] catsArray, Plate plate){
        feedCats(catsArray, plate);
        plate.info();
        isSatiety(catsArray);
    }

    public static void isSatiety(Cat[] catsArray) {
        for (Cat cat : catsArray) {
            System.out.println(cat.getName() + " " + (cat.isSatiety() ? "сыт" : "голоден"));
        }
    }

    public static void feedCats(Cat[] catsArray, Plate plate) {
        for (Cat cat : catsArray) {
            cat.eat(plate);
        }
    }
}
