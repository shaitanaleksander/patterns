package abstractFactory;

public class Room {
    private Chair chair;
    private Sofa sofa;

    private CoffeeTable coffeeTable;

    public Room(FurnitureFactory furnitureFactory) {

        this.chair = furnitureFactory.getChair();
        this.sofa = furnitureFactory.getSofa();
        this.coffeeTable = furnitureFactory.getCoffeeTable();
    }


}
