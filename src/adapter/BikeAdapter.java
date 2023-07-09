package adapter;

public class BikeAdapter extends Bike {

     private final  Car car;

    public BikeAdapter(Car car) {
        this.car = car;
    }

    @Override
    public void drive() {
        car.drive();
    }
}
