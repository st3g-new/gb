package lesson1_refactoring.obstacles;

import lesson1_refactoring.interfaces.Barrier;
import lesson1_refactoring.interfaces.Player;

public class Track implements Barrier {

    private final int length;

    public Track(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    @Override
    public void overcome(Player player) {
        player.run(this);
    }
}
