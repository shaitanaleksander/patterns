package adapter;

public class Main {

    public static void main(String[] args) {

        Bike bike = new BikeAdapter(new Car());

        bike.drive();
    }


    public static void bi(Bike bike) {
        bike.drive();
    }
}