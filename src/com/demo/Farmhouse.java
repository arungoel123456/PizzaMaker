package com.demo;

public class Farmhouse implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Farmhouse pizza preparation");
    }

    @Override
    public void bake() {
        System.out.println("Farmhouse pizza baking");
    }
}
