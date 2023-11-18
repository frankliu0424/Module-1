package com.Frank.module1_4;

import com.Frank.module1_4.Triangle;

public class Main4 {

    public static void main(String[] args){

        Triangle t = new Triangle();
        System.out.println(t.colour);
        t.change_colour(Colour.BLUE);
        System.out.println(t.colour);


    }
}
