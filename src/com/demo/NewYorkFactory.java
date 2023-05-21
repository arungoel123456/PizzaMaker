package com.demo;

public class NewYorkFactory extends AbstractPizzaFactory{
    @Override
    public Pizza getPizza(String type) {
        if(type.equalsIgnoreCase("New York Margherita")){
            return new NYMargherita();
        }
        else if(type.equalsIgnoreCase("New York Farmhouse")){
            return new NYFarmhouse();
        }
        else {
            return null;
        }
    }
}
