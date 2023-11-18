package com.Frank.module1_2;
public class Triangle extends TwoDShape{
    private double side_1;
    private double side_2;
    private double side_3;

    // Represents the length of side 1, 2, 3 of the triangle, respectively

    // Constructor for creating a triangle with specific width and height
    public Triangle(double width, double height){
        super(width, height); // Calls the constructor of the superclass TwoDShape
    }

    // Constructor for creating a triangle with specific side lengths
    public Triangle (double side_1, double side_2, double side_3){
        super(); // Calls the default constructor of the superclass TwoDShape
        this.side_1 = side_1; // Initializes side_1, side_2, side_3
        this.side_2 = side_2;
        this.side_3 = side_3;
        super.setWidth(side_2); // Sets the width of the triangle (side_2 is considered as width)
        super.setHeight(this.HeronsHeight()); // Sets the height calculated by Heron's formula
    }

    // Private method to calculate the height of the triangle by Heron's formula
    private double HeronsHeight(){
        double s = 0.5*(side_1+side_2+side_3);
        // Calculates the height using the area derived from Heron's formula
        double h = (2*Math.sqrt(s*(s-side_1)*(s-side_2)*(s-side_3)))/side_2;
        return h;
    }
    public double getArea(){
        double area = 0.5*super.getWidth()*super.getHeight();
        return area;
    }
    public String toString(){
        return "Triangle, Area: " + this.getArea();
    }
}
