package org.fasttrackit;

import java.util.Scanner;

public class MathFunctions {


    public void Adding() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A+B ");
        System.out.println("type first number A:");
        int a = Scanner();
        System.out.println("type second numberB :");
        int b = Scanner();
        int c = (a + b);
        System.out.println(" You have selected Add, adding (A + B) result is: " + c);

    }

    public void Subtract() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A-B ");
        System.out.println("type first number A:");
        int a = Scanner();
        System.out.println("type second numberB :");
        int b = Scanner();
        int c = (a - b);
        System.out.println(" You have selected Subtract, subtracting (A - B) result is: " + c);

    }

    public void Multiply() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A*B ");
        System.out.println("type first number A:");
        int a = Scanner();
        System.out.println("type second numberB :");
        int b = Scanner();
        int c = (a * b);
        System.out.println(" You have selected Multiply, multiplying (A * B) result is: " + c);

    }

    public void Divide() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A/B ");
        System.out.println("type first number A:");
        int a = Scanner();
        System.out.println("type second numberB :");
        int b = Scanner();
        int c = (a / b);
        System.out.println(" You have selected Divide, dividing (A / B), result is: " + c);

    }


    public int Scanner(){


        Scanner s = new Scanner(System.in);
        int input ;
        System.out.println(" Type the number: ");
        input = s.nextInt();


        return input;
    }


    public double ScannerD(){

        Scanner s = new Scanner(System.in);
        double inputD ;
        System.out.println(" Type the number: ");
        inputD = s.nextDouble();


        return inputD;
    }
}
