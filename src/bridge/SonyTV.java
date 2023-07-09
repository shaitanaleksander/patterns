package bridge;

public class SonyTV implements TV{
    @Override
    public void on() {
        System.out.println("sony tv is on");
    }

    @Override
    public void off() {

        System.out.println("sony tv is off");
    }

    @Override
    public void tuneChannel(int channel) {
        System.out.println("switching to different channel");
    }
}
