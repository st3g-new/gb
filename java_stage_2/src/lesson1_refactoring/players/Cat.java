package lesson1_refactoring.players;

import lesson1_refactoring.obstacles.Track;
import lesson1_refactoring.obstacles.Wall;
import lesson1_refactoring.interfaces.Player;

public class Cat implements Player {

    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean play;

    public Cat(String model, int runLimit, int jumpLimit) {
        this.name = model;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }

    @Override
    public void jump(Wall wall) {
        if (play) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.println("Кот по кличке " + name + " преодолел препятствие высотой " + wall.getHeight());
                return;
            }

            System.out.println("Кот по кличке " + name + " не преодолел препятствие высотой " + wall.getHeight());
            play = false;
        }
    }

    @Override
    public boolean isPlay() {
        return play;
    }

    @Override
    public void run(Track track) {
        if (play) {
            if (jumpLimit >= track.getLength()) {
                System.out.println("Кот по кличке " + name + " преодолел препятствие длиной " + track.getLength());
                return;
            }

            System.out.println("Кот по кличке " + name + " не преодолел препятствие длиной " + track.getLength());
            play = false;
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                '}';
    }
}
