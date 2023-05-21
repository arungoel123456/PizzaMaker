import com.demo.*;

public class Main {
    public static void main(String[] args) {
//        Pizza margheritaPizza= new Margherita(24);
//        margheritaPizza.prepare();
//        margheritaPizza.bake();
//
//        Pizza farmhousePizza= new Farmhouse();
//        farmhousePizza.prepare();
//        farmhousePizza.bake();

//        PizzaFactory pizzaFactory = new PizzaFactory();
//        Pizza margheritaPizza= pizzaFactory.createPizza("margherita");
//        margheritaPizza.prepare();
//        margheritaPizza.bake();


        Pizza nyFarmhousePizza= new NewYorkFactory().getPizza("new york farmhouse");
        nyFarmhousePizza.prepare();
        nyFarmhousePizza.bake();

    }
}