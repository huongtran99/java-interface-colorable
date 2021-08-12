package com.codegym;

import com.codegym.colorable.Colorable;
import com.codegym.geometry.Circle;
import com.codegym.geometry.Rectangle;
import com.codegym.geometry.Shape;
import com.codegym.geometry.Square;


public class Main {

    public static void main(String[] args) {
        Shape[] shape = new Shape[3];

        shape[0] = new Circle(3.5);
        shape[1] = new Rectangle(3.5,3.5);
        shape[2] = new Square(2.5);

        for (int i = 0; i < shape.length; i++) {
            if(shape[i] instanceof Colorable) {
                System.out.print("Colorable: ");
                System.out.print("Area: " + shape[i].getArea() + " ,");
                ((Colorable) shape[i]).howToColor();
            } else {
                System.out.println("Area: " + shape[i].getArea());
            }
        }
    }
}
