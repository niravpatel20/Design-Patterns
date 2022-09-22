package com.designpattern.stuctural.decorator.shapes;

public abstract class ShapeDecorator implements Shape {

    protected Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    public void draw() {
        decoratedShape.draw();
    }
}
