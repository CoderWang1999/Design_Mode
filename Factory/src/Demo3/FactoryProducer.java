package Demo3;

public class FactoryProducer {
    public static AbstractFactory getFactory(String factory){
        if (factory==null){
            return null;
        }
        if (factory.equals("Shape")){
            return new ShapeFactory();
        }
        if (factory.equals("Color")){
            return new ColorFactory();
        }
        return null;
    }
}
