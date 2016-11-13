import java.util.Scanner;

/**
 * SwapDigit.java
 *
 * The program exchanges, given an input of a two digit integer number, the two
 * digits and displays the output in the console.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version September 3, 2016
 *
 */
 public class SwapDigit {
   /**
    * Program's main entry point
    *
    * @param args the parameter (array of strings) for the main method
    */
    public static void main(String[] args) {
      Scanner userInput = new Scanner (System.in); // Reads the user's inputs

      System.out.println("Enter number");

      String number = userInput.nextLine(); // User's input for number as string type

      String swap = number.substring(1, 2) + number.substring(0, 1); // Swap the digits

      System.out.println("Swapped: " + Integer.parseInt(swap)); // parse String to int

    }
 }
