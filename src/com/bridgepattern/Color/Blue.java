package com.bridgepattern.Color;

public class Blue implements Color {
    private final String color;

    public Blue(){
        this.color = "Blue";
    }

    @Override
    public void fill() {
        System.out.println("Filling with the " + this.color + " color");
    }
}
