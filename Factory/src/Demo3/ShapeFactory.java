package Demo3;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        if (shapeType==null){
            return null;
        }
        if (shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        if (shapeType.equals("Circle")){
            return new Circle();
        }
        return null;
    }
}
