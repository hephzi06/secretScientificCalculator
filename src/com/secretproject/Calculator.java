package com.secretproject;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {


    public void intro (){
        System.out.println("""
                Select a mode\s
                1. Addition\s
                2. Subtraction\s
                3. Multiplication\s
                4. Division\s
                5. Mortgage\s
                6. Loan Repayment Scheme\s
                7. Simple Interest""");
        Scanner select = new Scanner(System.in);
        byte pick = select.nextByte();
        if(pick == 1){
            addition();
        }else if(pick == 2){
            subtraction();
        }else if(pick == 3){
            multiplication();
        }else if(pick == 4){
            division();
        }else if(pick == 5){
            mortgage();
        }else if(pick == 6){
            loanRepayment();
        }else if(pick == 7){
            simpleInterest();
        }
    }

    /** addition */
    public void addition(){
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

    /** subtraction */

    public void subtraction(){
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
    /** multiplication */
    public void multiplication(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be added");
        int num = myInput.nextInt();
        double [] numbers= new double[num];
        double multipy = 0;
        System.out.println("Enter the numbers");
        for(int i= 0; i < num ; i++){

            numbers[i] = myInput.nextDouble();
            multipy = multipy * numbers[i];

        }
        System.out.println(multipy);
    }

    /** division */
    public void division(){
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

    /** loan repayment scheme */

    public void loanRepayment(){
        Scanner repay = new Scanner(System.in);
        System.out.print("Enter loan amount:  ");
        double loan = repay.nextDouble();
        System.out.print("Enter percentage: ");
        float percent = repay.nextFloat() / 100;
        System.out.print("Enter months to be paid:  ");
        int month = repay.nextInt();

        for (int i = 0; i < month; i++){
            loan = loan - (loan * percent) ;


            System.out.println("You'll pay " + Math.round(loan) + " this month");
        }



    }
    /** mortgage */
    public void mortgage(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Principal:  ");
        double principal = myInput.nextDouble();

        System.out.println("Annual rate:  ");
        float annual_rate = myInput.nextFloat();


        System.out.println("Numbers of years:  ");
        byte years = myInput.nextByte();

        final byte NUMBERS_IN_YEARS = 12;
        final byte  PERCENT = 100;


        double monthly_rate = annual_rate / 100 / 12;
        int numbers_of_payment = years * 12;



        double power = Math.pow(1 + monthly_rate, numbers_of_payment);
        double mortgage =principal * ((monthly_rate * power) / (power -1));




        Locale locale = null;
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        String money = currency.format(mortgage);
        System.out.println(money);

    }

    /** simple interest */
    public void simpleInterest(){
        Scanner myInput = new Scanner(System.in);
        System.out.println("Principal:  ");
        double principal = myInput.nextDouble();
        System.out.println("Rate:  ");
        float rate =  myInput.nextFloat() / 100;
        System.out.println("Period: ");
        int time = myInput.nextInt();
        double simpleInterest = principal * rate * time;
        Locale locale = null;

        NumberFormat interest = NumberFormat.getCurrencyInstance();
        String currency = interest.format(simpleInterest);
        System.out.println(currency);
    }

}

