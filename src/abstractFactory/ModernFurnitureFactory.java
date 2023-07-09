package abstractFactory;

public class ModernFurnitureFactory implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ModernCoffeeTable();
    }
}
