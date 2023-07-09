package prototype;

public class Main {
    public static void main(String[] args) {
        Car mustang = new Car("Ford", "Mustang", "Red", 40000, true, new Engine());

        Car BMW = mustang.clone();

        BMW.setBrand("BMW");
        BMW.setModel("M5");

        System.out.println(mustang.engine == BMW.engine);

    }
}
