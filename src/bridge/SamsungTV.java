package bridge;

public class SamsungTV implements TV{

    @Override
    public void on() {
        System.out.println("samsung tv is on");
    }

    @Override
    public void off() {

        System.out.println("samsung tv is off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("switching to different channel");
    }
}
