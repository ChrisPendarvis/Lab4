package com.example.lab4;

import java.io.FileNotFoundException;

public class Lab4 {
    public static void main(String[] args) throws FileNotFoundException {
        if (Utils.cube(3) == 27){
            System.out.println("Cube is true.");
        };
        if (Utils.prime(7)){
            System.out.println("Prime method works.");
        };
        System.out.println(Utils.intread());
    }
}