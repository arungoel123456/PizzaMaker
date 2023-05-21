package com.demo;

public class ThinCrust implements Pizza{

    @Override
    public void prepare() {
        System.out.println("Thin crust pizza preparing");
    }

    @Override
    public void bake() {
        System.out.println("Thin crust pizza baking");
    }
}
