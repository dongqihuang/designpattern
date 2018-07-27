package builder;

public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Food();
    }

    @Override
    public abstract float price();
}
