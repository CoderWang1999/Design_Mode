package Demo1;

public class Application {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Fruit apple = factory.getFruit("Demo1.Apple");
        apple.eat();
        Fruit orange = factory.getFruit("Demo1.Orange");
        orange.eat();
    }
}
