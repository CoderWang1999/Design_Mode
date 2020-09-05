package Demo2;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if (shapeType==null){
            return null;
        }
        if (shapeType.equals("Circle")){
            return new Circle();
        }
        if (shapeType.equals("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
