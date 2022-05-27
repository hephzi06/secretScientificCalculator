package com.secretproject;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {
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
}
