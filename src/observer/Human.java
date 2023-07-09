package observer;

public class Human  implements Receiver{
    @Override
    public void receive(String newspaper) {
        System.out.println("I am reading new newspaper");
    }
}
