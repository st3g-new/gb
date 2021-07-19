package lesson1_refactoring.obstacles;

import lesson1_refactoring.interfaces.Barrier;
import lesson1_refactoring.interfaces.Player;

public class Wall implements Barrier {

    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void overcome(Player player) {
        player.jump(this);
    }
}
