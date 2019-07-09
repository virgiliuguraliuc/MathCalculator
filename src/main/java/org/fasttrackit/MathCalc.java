package org.fasttrackit;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MathCalc {
    public static void main(String[] args) {


      double A, B;

        Scanner s = new Scanner(System.in);

        System.out.println(" Type two numbers you want to do mathematical calculations with. ");
        System.out.println(" Type the first number (A). ");
        A = s.nextDouble();
        System.out.println(" First number is: " + A);
        System.out.println(" Type the second number (B). ");
        B = s.nextDouble();
        System.out.println(" Second number is: " + B);


      System.out.println("Select type of arithmetical operation:\n" +
              "1 - for adding\n" +
              "2 - for subtraction\n" +
              "3 - for multiplication\n" +
              "4 - for division\n");

      MathFunctions calc = new MathFunctions();


      Scanner s1 = new Scanner(System.in);
      int d = s1.nextInt();
      
      if (d == 1 ) {
        calc.Adding(A,B);
      }
      if (d == 2 ) {
        calc.Subtract(A,B);
      }
      if (d == 3){
        calc.Multiply(A,B);
      }
      if (d == 4){
        calc.Divide(A,B);
      }
      else {
        System.out.println("Ai facut ceva ce nu ma asteptam, m-am panicat");
      }


    }
}