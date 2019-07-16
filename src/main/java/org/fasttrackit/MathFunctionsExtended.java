package org.fasttrackit;

public class MathFunctionsExtended extends MathFunctions {

    @Override
    public void Adding() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A+B ");
        System.out.println("type first number A:");
        double a = ScannerD();
        System.out.println("type second numberB :");
        double b = ScannerD();
        double c = (a + b);
        System.out.println(" You have selected Add, adding (A + B) result is: " + c);

    }

    @Override
    public void Subtract() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A-B ");
        System.out.println("type first number A:");
        double a = ScannerD();
        System.out.println("type second numberB :");
        double b = ScannerD();
        double c = (a - b);
        System.out.println(" You have selected Subtract, subtracting (A - B) result is: " + c);
    }

    @Override
    public void Multiply() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A*B ");
        System.out.println("type first number A:");
        double a = ScannerD();
        System.out.println("type second numberB :");
        double b = ScannerD();
        double c = (a * b);
        System.out.println(" You have selected Multiply, multiplying (A * B) result is: " + c);
    }

    @Override
    public void Divide() {
        System.out.println(" Type two numbers you want to do mathematical calculations with \n Example A/B ");
        System.out.println("type first number A:");
        double a = ScannerD();
        System.out.println("type second numberB :");
        double b = ScannerD();
        double c = (a / b);
        System.out.println(" You have selected Divide, dividing (A / B), result is: " + c);
    }
}
