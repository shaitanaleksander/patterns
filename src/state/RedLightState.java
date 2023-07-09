package state;

public class RedLightState implements TrafficLightState {


    @Override
    public void action(TrafficLightContext context) {
        System.out.println("Red light - Stop");
        context.setState(new GreenLightState());
    }
}
