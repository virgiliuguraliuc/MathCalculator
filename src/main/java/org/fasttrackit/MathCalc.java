package org.fasttrackit;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class MathCalc {
    public static void main(String[] args) {


      System.out.println("Select type of arithmetical operation:\n" +
              "1 - for adding\n" +
              "2 - for subtraction\n" +
              "3 - for multiplication\n" +
              "4 - for division\n");

      MathFunctions calcInt = new MathFunctions();
      MathFunctionsExtended calcDouble = new MathFunctionsExtended();

//      Scanner s1 = new Scanner(System.in);
//      int d = s1.nextInt();
//
//      if (d == 1 ) {
//        calcInt.Adding();
//      }
//      if (d == 2 ) {
//      calc.Subtract();
//      }
//      if (d == 3){
//      calcInt.Multiply();
//      }
//      if (d == 4){
//      calcInt.Divide();
//      }
//      else {
//        System.out.println("Ai facut ceva ce nu ma asteptam, m-am panicat");
//      }


      Scanner s1 = new Scanner(System.in);
      int d = s1.nextInt();

      if (d == 1 ) {
        calcDouble.Adding();
      }
      if (d == 2 ) {
        calcDouble.Subtract();
      }
      if (d == 3){
        calcDouble.Multiply();
      }
      if (d == 4){
        calcDouble.Divide();
      }
      else {
        System.out.println("Ai facut ceva ce nu ma asteptam, m-am panicat");
      }
    }



}