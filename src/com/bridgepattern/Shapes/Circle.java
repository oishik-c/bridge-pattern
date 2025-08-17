package com.bridgepattern.Shapes;

import com.bridgepattern.Color.Color;

public class Circle extends Shape {
    private final Color color;

    public Circle(Integer ShapeSize, Color color){
        this.ShapeName = "Circle";
        this.ShapeSize = ShapeSize;
        this.color = color;
    }

    @Override
    public void draw() {
        System.out.println("Drawing " + this.ShapeName + " with Radius " + this.ShapeSize);
        this.color.fill();
    }
}
