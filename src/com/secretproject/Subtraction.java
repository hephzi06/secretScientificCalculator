package com.secretproject;

import java.util.Scanner;

public class Subtraction {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be added");
        int num = myInput.nextInt();
        double [] numbers= new double[num];
        double subtraction = 0;
        System.out.println("Enter the numbers");
        for(int i= 0; i < num ; i++){

            numbers[i] = myInput.nextDouble();
            subtraction = subtraction - numbers[i];

        }
        System.out.println(subtraction);
    }
}
