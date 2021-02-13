package com.example.helloworld;

public class lab_3 {
    public static void main (String[]args){
        double x = 1.0;
        double y = 0.0;
        while (x < 2.1) {
            y += Math.sin(x);
            x += 0.1;
        }
        System.out.println("result: "+y);//10.43190389173153
    }
}
