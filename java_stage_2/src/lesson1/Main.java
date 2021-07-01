package lesson1;

import lesson1.obstacle.Obstacle;
import lesson1.obstacle.Treadmill;
import lesson1.obstacle.Wall;
import lesson1.participants.Cat;
import lesson1.participants.Human;
import lesson1.participants.Participants;
import lesson1.participants.Robot;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Obstacle> obstacles = List.of(
                new Treadmill(300),
                new Wall(2),
                new Treadmill(250),
                new Wall(3),
                new Treadmill(500)
        );

        List<Participants> participants = List.of(
          new Human(200, 1),
          new Robot(1000, 10),
          new Cat(1500, 3)
        );

        for (Participants participant : participants) {
            for (Obstacle obstacle : obstacles) {
                if(obstacle instanceof Treadmill && !participant.run(obstacle.getCharacteristic())){
                    System.out.println("Не получилось! Участник выбывает");
                    break;
                }
                if(obstacle instanceof Wall && !participant.jump(obstacle.getCharacteristic())){
                    System.out.println("Не получилось! Участник выбывает");
                    break;
                }
                System.out.println("Участник успешно прошел испытания!");
            }
        }
    }
}
