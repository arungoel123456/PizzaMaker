package com.demo;

public class NYMargherita implements  Pizza{

    @Override
    public void prepare() {
        System.out.println("New York Margherita pizza preparing");
    }

    @Override
    public void bake() {
        System.out.println("New York Margherita pizza baking");
    }

}
