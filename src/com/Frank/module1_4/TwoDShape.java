package com.Frank.module1_4;
public abstract class TwoDShape {
     private double width;
     private double height;
     Colour colour;// Add Colour field

    public TwoDShape(double width, double height, Colour colour){
         this.width = width;
         this.height = height;
         this.colour = colour;
     }

    /**
     * Default constructor now defined a default colour of NONE.
     */
    public TwoDShape(){
         colour = Colour.NONE; // Add colour to the default constructor
         width = 0;
         height = 0;
     }



    /** This method changes the colour of the shape.
     *
     * @param c: User need to provide a Colour Enum class field (RED, GREEN, BLUE)
     */
     public void change_colour (Colour c){
        colour = c;

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
