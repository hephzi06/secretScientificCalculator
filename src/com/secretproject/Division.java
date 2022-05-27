package com.secretproject;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be divided");
        int num = myInput.nextInt();
        double [] numbers= new double[num];
        double division = 1;
        System.out.println("Enter the numbers");
        for(int i= 0; i < num ; i++){

            numbers[i] = myInput.nextDouble();
            division = division / numbers[i];

        }
        System.out.println(division);
    }
}
