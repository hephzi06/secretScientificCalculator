package com.secretproject;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {


    public void intro() {
        System.out.println("""
                Select a mode\s
                1. Addition\s
                2. Subtraction\s
                3. Multiplication\s
                4. Division\s
                5. Mortgage\s
                6. Loan Repayment Scheme\s
                7. Simple Interest\s
                8. Power\s
                9. Square\s
                10. Square root\s
                11. Cube\s
                12. Prime Number\s
                13. Round up, ceiling and flooring\s
                14. Tan, Cos, Sin, asin, acos, atan \s
                15. Exponential
                """);
        Scanner select = new Scanner(System.in);
        byte pick = select.nextByte();
        if (pick == 1) {
            addition();
        } else if (pick == 2) {
            subtraction();
        } else if (pick == 3) {
            multiplication();
        } else if (pick == 4) {
            division();
        } else if (pick == 5) {
            mortgage();
        } else if (pick == 6) {
            loanRepayment();
        } else if (pick == 7) {
            simpleInterest();
        } else if (pick == 8) {
            power();
        } else if (pick == 9) {
            square();
        } else if (pick == 10) {
            squareRoot();
        } else if (pick == 11) {
            cube();
        } else if (pick == 12) {
            primes();
        } else if (pick == 13) {
            roundup();
        } else if (pick == 14) {
            cos_sin_tan();
        } else if (pick == 15) {
            expoential();
        }
    }

    /**
     * addition
     */
    public void addition() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be added");
        int num = myInput.nextInt();
        double[] numbers = new double[num];
        double addition = 0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {

            numbers[i] = myInput.nextDouble();
            addition = addition + numbers[i];


        }
        System.out.println(addition);
    }

    /**
     * subtraction
     */

    public void subtraction() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be subtracted");
        int num = myInput.nextInt();
        double[] numbers = new double[num];
        double subtraction = 0;
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {

            numbers[i] = myInput.nextDouble();
            subtraction = subtraction - numbers[i];

        }
        System.out.println(subtraction);
    }

    /**
     * multiplication
     */
    public void multiplication() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be multiplied");
        int num = myInput.nextInt();
        double[] numbers = new double[num];
        double multipy = 1;
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {

            numbers[i] = myInput.nextDouble();
            multipy = multipy * numbers[i];

        }
        System.out.println(multipy);
    }

    /**
     * division
     */
    public void division() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("How many number should be divided");
        int num = myInput.nextInt();
        double[] numbers = new double[num];
        double division = 1;
        System.out.println("Enter the numbers");
        for (int i = 0; i < num; i++) {

            numbers[i] = myInput.nextDouble();
            division = division / numbers[i];

        }
        System.out.println(division);
    }

    /**
     * loan repayment scheme
     */

    public void loanRepayment() {
        Scanner repay = new Scanner(System.in);
        System.out.print("Enter loan amount:  ");
        double loan = repay.nextDouble();
        System.out.print("Enter percentage: ");
        float percent = repay.nextFloat() / 100;
        System.out.print("Enter months to be paid:  ");
        int month = repay.nextInt();

        for (int i = 0; i < month; i++) {
            loan = loan - (loan * percent);


            System.out.println("You'll pay " + Math.round(loan) + " this month");
        }


    }

    /**
     * mortgage
     */
    public void mortgage() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Principal:  ");
        double principal = myInput.nextDouble();

        System.out.println("Annual rate:  ");
        float annual_rate = myInput.nextFloat();


        System.out.println("Numbers of years:  ");
        byte years = myInput.nextByte();

        final byte NUMBERS_IN_YEARS = 12;
        final byte PERCENT = 100;


        double monthly_rate = annual_rate / 100 / 12;
        int numbers_of_payment = years * 12;


        double power = Math.pow(1 + monthly_rate, numbers_of_payment);
        double mortgage = principal * ((monthly_rate * power) / (power - 1));


        Locale locale = null;
        NumberFormat currency = NumberFormat.getCurrencyInstance(Locale.UK);
        String money = currency.format(mortgage);
        System.out.println(money);

    }

    /**
     * simple interest
     */
    public void simpleInterest() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Principal:  ");
        double principal = myInput.nextDouble();
        System.out.println("Rate:  ");
        float rate = myInput.nextFloat() / 100;
        System.out.println("Period: ");
        int time = myInput.nextInt();
        double simpleInterest = principal * rate * time;
        Locale locale = null;

        NumberFormat interest = NumberFormat.getCurrencyInstance();
        String currency = interest.format(simpleInterest);
        System.out.println(currency);
    }

    /**
     * power
     **/
    public void power() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("First Number: ");
        int first = myInput.nextInt();
        System.out.print("Second Number: ");
        int second = myInput.nextInt();
        int answer = (int) Math.pow(first, second);
        System.out.println(answer);

    }

    /**
     * square
     **/
    public void square() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("First Number: ");
        int first = myInput.nextInt();
        int answer = (int) Math.pow(first, 2);
        System.out.println(answer);

    }

    /**
     * square root
     **/
    public void squareRoot() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("First Number: ");
        int first = myInput.nextInt();
        double answer = Math.sqrt(first);
        System.out.println(answer);
    }

    /**
     * cube
     **/
    public void cube() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("First Number: ");
        int first = myInput.nextInt();
        int answer = (int) Math.pow(first, 3);
        System.out.println(answer);

    }

    /**
     * primes
     **/
    public void primes() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Number: ");
        int num = myInput.nextInt();
        if (num <= 0) {
            System.out.println("Invalid number");
            System.exit(0);
        }
        int i = 2;
        boolean prime = true;
        while (i <= num / 2) {

            if (num % i == 0) {
                prime = false;
                break;
            }
            i++;
        }
        if (prime) {
            System.out.println("It is a prime number");
        } else {

            System.out.println("It is not a prime number");
        }


    }

    public void roundup() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Number: ");
        double num = myInput.nextDouble();
        System.out.println("Rounded up: " + Math.round(num));
        System.out.println("Ceil up: " + Math.ceil(num));
        System.out.println("Floor down: " + Math.floor(num));

    }

    public void cos_sin_tan() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Angle: ");
        double num = Math.toRadians(myInput.nextDouble());
        System.out.println("Sin = " + Math.sin(num));
        System.out.println("Cos = " + Math.cos(num));
        System.out.println("Tan = " + Math.tan(num));
        System.out.println("Inverse of sin = " + Math.asin(num));
        System.out.println("Inverse of cos = " + Math.acos(num));
        System.out.println("Inverse of Tan = " + Math.atan(num));
    }

    public void expoential() {
        Scanner myInput = new Scanner(System.in);
        System.out.print("Base number: ");
        int num = myInput.nextInt();
        System.out.print("Power : ");
        int power = myInput.nextInt();
        if (power <= 0) {
            System.exit(0);
        }
        long exponent = (long) Math.pow(num, power);
        System.out.println("Answer = " + exponent);


    }
    public void max(){
        Scanner myInput =  new Scanner(System.in);
        System.out.println("Length of numbers");
        int length = myInput.nextInt();
        int[] numbers = new int[length];
        int  determiner = numbers[0];
        System.out.println("Numbers to be checked");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = myInput.nextInt();

            if(numbers[i] > determiner){
                determiner =numbers[i];
            }
        }
        System.out.println(determiner);
    }

    public void min(){
        Scanner myInput =  new Scanner(System.in);
        System.out.println("Length of numbers");
        int length = myInput.nextInt();
        int[] numbers = new int[length];
        int  determiner = numbers[0];
        System.out.println("Numbers to be checked");
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = myInput.nextInt();

            if(numbers[i] < determiner){
                determiner =numbers[i];
            }
        }
        System.out.println(determiner);
    }


}

