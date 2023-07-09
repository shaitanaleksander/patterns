package bridge;

public class AdvancedRemote extends RemountControl{

    public AdvancedRemote(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        System.out.println("making welcome sound");
        this.tv.on();
    }

    @Override
    public void turnOff() {
        System.out.println("making bye sound");
        this.tv.off();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("chanel to switch is " + channel);
        this.tv.tuneChannel(channel);

    }
}
