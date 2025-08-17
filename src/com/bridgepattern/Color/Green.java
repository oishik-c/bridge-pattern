package com.bridgepattern.Color;

public class Green implements Color{
    private final String color;

    public Green() {
        this.color = "Green";
    }

    @Override
    public void fill() {
        System.out.println("Filling with color " + this.color + " AKA the color of nature");
    }
}
