package com.bridgepattern.Shapes;

import com.bridgepattern.Color.Color;

public class Square extends Shape {
    private Color color;

    public Square(Integer ShapeSize, Color color) {
        this.ShapeName = "Square";
        this.ShapeSize = ShapeSize;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.ShapeName + " with Side Length " + this.ShapeSize);
        this.color.fill();
    }

    public void changeColor(Color color){
        this.color = color;
    }
}
