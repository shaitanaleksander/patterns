package abstractFactory;

public class ArtDecoFurnitureFactory  implements FurnitureFactory{
    @Override
    public Chair getChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa getSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable getCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}
