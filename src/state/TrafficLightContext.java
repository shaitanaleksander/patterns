package state;

public class TrafficLightContext {

    private TrafficLightState state;

    public TrafficLightContext() {
        state = new RedLightState();
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }

    public  void changeState() {
        state.action(this);
    }
}
