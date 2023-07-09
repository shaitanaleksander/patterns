package bridge;

public class BasicRemote extends RemountControl{


    public BasicRemote(TV tv) {
        super(tv);
    }

    @Override
    public void turnOn() {
        this.tv.on();
    }

    @Override
    public void turnOff() {
        this.tv.off();
    }

    @Override
    public void setChannel(int channel) {
        this.tv.tuneChannel(channel);
    }
}
