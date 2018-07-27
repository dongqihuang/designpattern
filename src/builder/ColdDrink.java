package builder;

public abstract class ColdDrink implements Item {

    @Override
    public Packing packing(){
        return new Drink();
    }

    @Override
    public abstract float price();
}
