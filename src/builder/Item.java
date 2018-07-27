package builder;

public interface Item {
    public String name();

    public default Packing packing() {
        return null;
    }

    public float price();
}
