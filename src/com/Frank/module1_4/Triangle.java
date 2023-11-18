package com.Frank.module1_4;
public class Triangle extends TwoDShape implements Rotate{
    private double side_1;
    private double side_2;
    private double side_3;

    // Add a new field angle to implement Rotate interface
    double ori_angle = ANGLE;

    public Triangle(){
        super();
    }

    public Triangle(double width, double height, Colour colour){
        super(width, height, colour);
    }

    public Triangle (double side_1, double side_2, double side_3){
        super();
        this.side_1 = side_1;
        this.side_2 = side_2;
        this.side_3 = side_3;
        super.setWidth(side_2);
        super.setHeight(this.HeronsHeight());
    }

    private double HeronsHeight(){
        double s = 0.5*(side_1+side_2+side_3);
        double h = (2*Math.sqrt(s*(s-side_1)*(s-side_2)*(s-side_3)))/side_2;
        return h;
    }
    @Override
    public double getArea(){
        double area = 0.5 * super.getWidth() * super.getHeight();
        return area;
    }
    public String toString(){
        return "Triangle, Area: " + this.getArea();
    }

    @Override
    public void rotate90() {
        ori_angle += 90;
    }

    @Override
    public void rotate180() {
        ori_angle += 180;
    }

    @Override
    public void rotate(double degree) {
        ori_angle += degree;
    }
}
