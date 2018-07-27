package abatractFactory;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factype){
        switch (factype){
            case "Shape":
                return new ShapeFactory();
            case "Color":
                return new ColorFactory();
        }
        return null;
    }
}
