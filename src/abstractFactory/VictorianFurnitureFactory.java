package abstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new VactorianChair();
    }

    @Override
    public Sofa getSofa() {
        return new VictorianSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new VictorianCoffeeTable();
    }
}
