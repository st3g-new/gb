package lesson1_refactoring.players;

import lesson1_refactoring.obstacles.Track;
import lesson1_refactoring.obstacles.Wall;
import lesson1_refactoring.interfaces.Player;

public class Human implements Player {

    private final String name;
    private final int runLimit;
    private final int jumpLimit;
    private boolean play;

    public Human(String model, int runLimit, int jumpLimit) {
        this.name = model;
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.play = true;
    }

    @Override
    public void jump(Wall wall) {
        if (play) {
            if (jumpLimit >= wall.getHeight()) {
                System.out.println("Человек по имени " + name + " преодолел препятствие высотой " + wall.getHeight());
                return;
            }

            System.out.println("Человек по имени " + name + " не преодолел препятствие высотой " + wall.getHeight());
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
                System.out.println("Человек по имени " + name + " преодолел препятствие длиной " + track.getLength());
                return;
            }

            System.out.println("Человек по имени " + name + " не преодолел препятствие длиной " + track.getLength());
            play = false;
        }
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                '}';
    }
}
