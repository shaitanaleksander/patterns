package state;

public class YellowLightState implements TrafficLightState{
    @Override
    public void action(TrafficLightContext context) {
        System.out.println("Yellow light - run faster!!");
        context.setState(new RedLightState());
    }
}
