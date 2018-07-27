package abatractFactory;

public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        switch (shapeType){
            case "Circle":
                return new Circle();
            case "Square":
                return new Square();
            case "Rectangle":
                return new Rectangle();
        }
        return null;
    }

    @Override
    public Color getColor(String color){
        return null;
    }

}
