package lesson1.participants;

public class Robot extends Participants{
    private int runningCharacteristic;
    private int jumpCharacteristic;

    public Robot(int runningCharacteristic, int jumpCharacteristic) {
        this.runningCharacteristic = runningCharacteristic;
        this.jumpCharacteristic = jumpCharacteristic;
    }

    @Override
    public boolean jump(int characteristic) {
        System.out.println("Робот прыгает");
        return jumpCharacteristic >= characteristic;
    }

    @Override
    public boolean run(int characteristic) {
        System.out.println("Робот бежит");
        return runningCharacteristic >= characteristic;
    }

}
