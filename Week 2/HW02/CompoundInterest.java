import java.util.Scanner;

/**
 * CompoundInterest.java
 *
 * This program computes the interest that a bank would have on some principal
 * deposited in an account. The program takes three inputs from the console:
 * the principal amount, the annual interest rate, and the number of years
 * the money stayed in the account. The program then computes the compound
 * interest rounded to the nearest smaller integer values.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version September 3, 2016
 *
 */
 public class CompoundInterest {
   /**
    * Program's main entry point
    *
    * @param args the parameter (array of strings) for the main method
    */
    public static void main(String[] args) {

      Scanner userInput = new Scanner (System.in); // Reads user's inputs

      System.out.println("Enter principal");
      double principal = userInput.nextInt(); // User's input for principal amount

      System.out.println("Enter interest rate");
      double interestRate = (userInput.nextInt() / 100.0); // User's input for interest rate

      System.out.println("Enter years");
      double years = userInput.nextInt(); // User's input for years the money stayed in account

      double compoundInterest = principal * (Math.pow(1 + interestRate, years));

      double interest = Math.round(compoundInterest - principal);

      System.out.println("Interest = " + (int)interest);

    }
 }
