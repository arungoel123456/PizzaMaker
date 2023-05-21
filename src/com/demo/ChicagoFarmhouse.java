package com.demo;

public class ChicagoFarmhouse implements Pizza{
    @Override
    public void prepare() {
        System.out.println("ChicagoFarmhouse pizza preparing");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoFarmhouse pizza baking");
    }
}
