package builder;

public class Food implements Packing {
    @Override
    public String pack(){
        return "Wrapper";
    }
}
