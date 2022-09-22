package com.designpattern.stuctural.decorator.shapes;

public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape shape){
        System.out.println("Border color : Red");
    }
}
