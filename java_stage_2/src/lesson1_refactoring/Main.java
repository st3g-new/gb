package lesson1_refactoring;

import lesson1_refactoring.interfaces.Barrier;
import lesson1_refactoring.interfaces.Player;
import lesson1_refactoring.obstacles.Track;
import lesson1_refactoring.obstacles.Wall;
import lesson1_refactoring.players.Cat;
import lesson1_refactoring.players.Human;
import lesson1_refactoring.players.Robot;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.play();
    }

    void play() {
        Player[] players = {
                new Human("Иван", 10, 3),
                new Robot("R2D2", 15, 1),
                new Cat("Мурзик", 15, 10)
        };

        Barrier[] course = {
                new Track(2),
                new Wall(1),
                new Track(5),
                new Wall(7)
        };

        for(Barrier barrier:course){
            for(Player player:players){
                barrier.overcome(player);
            }
        }

        for(Player player: players){
            if(player.isPlay()){
                System.out.println(player);
            }
        }
    }
}
