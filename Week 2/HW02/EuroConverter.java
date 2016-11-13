import java.util.Scanner;

/**
 * Euro Converter.java
 *
 * This program converts an amount in US dollars to Euros. The program takes as
 * input the amount of US dollars to convert, and the number of dollars equivalent
 * to 100 Euros and then prints the equivalent number of Euros to the input amount
 * after performing the conversion.
 * Note: 1 USD = 0.90 Euro
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version September 3, 2016
 *
 */
 public class EuroConverter {
   /**
    * Program's main entry point
    *
    * @param args the parameter (array of strings) for the main method
    */
    public static void main(String[] args) {
      Scanner userInput = new Scanner (System.in); // Reads user's inputs

      System.out.println("Enter amount in USD");
      int usdDollars = userInput.nextInt(); // User's input for USD dollars

      System.out.println("Enter number of $ in 100 Euros");
      int numberOfDollarsEqualTo100Euros = userInput.nextInt(); // User's input for number of $ in 100 Euros

      double conversionResult = ((usdDollars * 100) / numberOfDollarsEqualTo100Euros); // converts to Euros using the user's two inputs

      System.out.println("Number of Euros = " + conversionResult);

    }
 }
