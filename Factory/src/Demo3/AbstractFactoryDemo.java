package Demo3;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        Shape rectangle = shapeFactory.getShape("Rectangle");
        rectangle.draw();
        Shape circle = shapeFactory.getShape("Circle");
        circle.draw();
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        Color red = colorFactory.getColor("Red");
        red.fil();
        Color blue = colorFactory.getColor("Blue");
        blue.fil();
    }
}
