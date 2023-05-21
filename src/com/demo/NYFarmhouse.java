package com.demo;

public class NYFarmhouse implements Pizza{
    @Override
    public void prepare() {
        System.out.println("New york farmhouse pizza preparing");
    }

    @Override
    public void bake() {
        System.out.println("New york farmhouse pizza baking");
    }
}
