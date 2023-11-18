package com.Frank.module1_3;
public abstract class TwoDShape {
     private double width;
     private double height;
     public TwoDShape(double width, double height){
         this.width = width;
         this.height = height;
     }
     public TwoDShape(){
         width = 0;
         height = 0;
//         Scanner s = new Scanner(System.in);
//         System.out.print("Enter the width of the shape: ");
//         width = s.nextDouble();
//         System.out.print("Enter the height of the shape: ");
//         height = s.nextDouble();
     }
     public abstract double getArea();
     public double getHeight(){
         return height;
     }
    public double getWidth() {
        return width;
    }
    public void setHeight(double height){
         this.height = height;
     }
     public void setWidth(double width) {
         this.width = width;
     }
 }
