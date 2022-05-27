package com.secretproject;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be added");
        int num = myInput.nextInt();
        double [] numbers= new double[num];
        double addition = 0;
        System.out.println("Enter the numbers");
        for(int i= 0; i < num ; i++){

            numbers[i] = myInput.nextDouble();
            addition = addition + numbers[i];


        }
        System.out.println(addition);
    }
}
