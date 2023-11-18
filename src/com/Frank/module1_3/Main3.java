package com.Frank.module1_3;

public class Main3 {

    public static void main(String[] args){
        Triangle t1 = new Triangle(2,3,4);
        System.out.println(t1.ori_angle);
        t1.rotate(345678);
        System.out.println(t1.ori_angle);
    }


}
