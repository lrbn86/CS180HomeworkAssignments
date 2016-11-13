import java.util.Scanner;

/**
 * Pythagoras.java
 *
 * This program takes two inputs wihch are the lengths of the base and height
 * of a right-angled triangle and uses the Pythagoras theorem (a^2 + b^2 = c^2)
 * to calculate the length of the hypotenuse of this triangle.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version September 3, 2016
 *
 */
public class Pythagoras {
  /**
   * Program's main entry point
   *
   * @param args the parameter (array of strings) for the main method
   */
  public static void main(String[] args) {
    Scanner userInput = new Scanner (System.in); // Reads user's inputs

    System.out.println("Enter a");
    int a = userInput.nextInt(); // the base length of the right-angled triangle

    System.out.println("Enter b");
    int b = userInput.nextInt(); // the height length of the right-angled triangle

    double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)); // calculated hypotenuse

    System.out.println("Hypotenuse = " + hypotenuse);

  }
}
