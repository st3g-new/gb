package lesson1.participants;

public class Cat extends Participants {
    private int runningCharacteristic;
    private int jumpCharacteristic;

    public Cat(int runningCharacteristic, int jumpCharacteristic) {
        this.runningCharacteristic = runningCharacteristic;
        this.jumpCharacteristic = jumpCharacteristic;
    }

    @Override
    public boolean jump(int characteristic) {
        System.out.println("Кот прыгает");
        return jumpCharacteristic >= characteristic;
    }

    @Override
    public boolean run(int characteristic) {
        System.out.println("Кот бежит");
        return runningCharacteristic >= characteristic;
    }

}
