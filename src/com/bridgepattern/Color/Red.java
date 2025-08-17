package com.bridgepattern.Color;

public class Red implements Color {
    private final String color;

    public Red() {
        this.color = "RED";
    }

    @Override
    public void fill() {
        System.out.println("Filling with the color " + this.color);
    }
}
