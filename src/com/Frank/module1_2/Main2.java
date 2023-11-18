package com.Frank.module1_2;

import com.Frank.module1_3.Circle;
import com.Frank.module1_3.Triangle;

import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {

        Circle c1 = new Circle(1.0);
        Triangle t1 = new Triangle(9.0, 10.0, 11.0);
        ArrayList<Object> shapes = new ArrayList<Object>();
        shapes.add(c1);
        shapes.add(t1);
        for(Object i : shapes){
            System.out.println(i);
        }
//        System.out.println(t1.getArea());
//        System.out.println(c1.getArea(w));
//        System.out.println(c1);
//        System.out.println(t1);


    }

}
