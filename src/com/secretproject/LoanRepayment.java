package com.secretproject;

import java.util.Scanner;

public class LoanRepayment {
    public static void main(String[] args) {
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
}
