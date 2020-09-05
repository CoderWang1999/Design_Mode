package Demo1;

public class Factory {
    public Fruit getFruit(String className){
        Fruit fruit=null;
        try {
            fruit=(Fruit) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return fruit;
    }
}
