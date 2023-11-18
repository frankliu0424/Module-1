package com.Frank.module1_3;
public class Circle extends TwoDShape{
    public final double PI = Math.PI;
    private double radius;
    public Circle (double radius){
        this.radius = radius;
    }
    @Override
    public double getArea(){
        double area = PI*Math.pow(radius,2.0);
        return area;
    }
    public String toString(){
        return "Circle, Area: " + this.getArea();
    }
}
