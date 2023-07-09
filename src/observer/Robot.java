package observer;

public class Robot implements Receiver{
    @Override
    public void receive(String newspaper) {
        System.out.println("Procession the newspaper");
    }
}
