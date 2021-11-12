package com.shapes;

public class Rectangle {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public  double area() {

        double area = length * breadth ;

        return area;
    }
}
