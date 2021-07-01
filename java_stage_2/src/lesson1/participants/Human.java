package lesson1.participants;

public class Human extends Participants{
    private int runningCharacteristic;
    private int jumpCharacteristic;

    public Human(int runningCharacteristic, int jumpCharacteristic) {
        this.runningCharacteristic = runningCharacteristic;
        this.jumpCharacteristic = jumpCharacteristic;
    }

    @Override
    public boolean jump(int characteristic) {
        System.out.println("Человек прыгает");
        return jumpCharacteristic >= characteristic;
    }

    @Override
    public boolean run(int characteristic) {
        System.out.println("Человек бежит");
        return runningCharacteristic >= characteristic;
    }

}
