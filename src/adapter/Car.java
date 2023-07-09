package adapter;

public class Car {

    private void startEngin() {
        System.out.println("brrr brrr engin started");
    }

    public void drive() {
        startEngin();
        System.out.println("car is moving");
    }
}
