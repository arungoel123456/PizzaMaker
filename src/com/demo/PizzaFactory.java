package com.demo;

public class PizzaFactory {
    public Pizza createPizza(String type)
    {
        if(type.equalsIgnoreCase("Margherita")){
            return new Margherita(240);
        }
        else if(type.equalsIgnoreCase("Farmhouse")){
            return new Farmhouse();
        }
        else {
            return null;
        }
    }
}
