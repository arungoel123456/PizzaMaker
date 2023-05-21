package com.demo;

public class ChicagoMargherita implements Pizza{
    @Override
    public void prepare() {
        System.out.println("ChicagoMargherita pizza preparing");
    }

    @Override
    public void bake() {
        System.out.println("ChicagoMargherita pizza baking");
    }
}
