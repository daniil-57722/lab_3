package com.example.helloworld;
import java.util.Scanner;

public class helloworld {
    public static void main (String[]args) {
        System.out.println("Input a number: ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double s = 0.0;
        for (int i = 1; i <= n; i++){
            float b = i;
            s += (b * 2) / (b * 2 + 1);
    }
        System.out.println("Result: "+s);
    }}
