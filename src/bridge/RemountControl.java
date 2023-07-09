package bridge;

public abstract class RemountControl {

    protected TV tv;

    public RemountControl(TV tv) {
        this.tv = tv;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void setChannel(int channel);
}
