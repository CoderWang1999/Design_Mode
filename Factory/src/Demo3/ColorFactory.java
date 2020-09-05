package Demo3;

public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color==null){
            return null;
        }
        if (color.equals("Blue")){
            return new Blue();
        }
        if (color.equals("Red")){
            return new Red();
        }
        return null;
    }

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }
}
