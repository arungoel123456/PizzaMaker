package com.demo;

public class ChicagoFactory extends AbstractPizzaFactory{

    @Override
    public Pizza getPizza(String type) {
        if(type.equalsIgnoreCase("Chicago Margherita")){
            return new ChicagoMargherita();
        }
        else if(type.equalsIgnoreCase("Chicago Farmhouse")){
            return new ChicagoFarmhouse();
        }
        else {
            return null;
        }
    }
}
