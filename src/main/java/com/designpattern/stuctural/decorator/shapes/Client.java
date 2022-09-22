package com.designpattern.stuctural.decorator.shapes;

public class Client {

    public static void main(String[] args) {

        // Square without border
        Square square = new Square();
        square.draw();

        // Square with border
        RedShapeDecorator squareWithRedBorder = new RedShapeDecorator(new Square());
        squareWithRedBorder.draw();
    }
}
