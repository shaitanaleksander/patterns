package state;

public class GreenLightState implements TrafficLightState{
    @Override
    public void action(TrafficLightContext context) {
        System.out.println("Green Light - Go");
        context.setState(new YellowLightState());
    }
}
