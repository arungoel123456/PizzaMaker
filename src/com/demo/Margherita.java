package com.demo;

public class Margherita implements Pizza{

    private int temp;

    public Margherita(int temp) {
        this.temp = temp;
    }

    @Override
    public void prepare() {
        System.out.println("Margherita pizza preparation");
    }

    @Override
    public void bake() {
        System.out.println("Margherita pizza baking");
    }
}
