aimport javax.swing.JOptionPane;

/**
 * Business Card
 *
 * The program gets the name, the major, and the e-mail of the user,
 * and then displays this information in a pop-up message of predefined format.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version 08/27/2016
 *
 */

 public class BusinessCard {
   /**
    * Program's main entry point
    *
    * @param args the parameter (array of strings) for the main method
    */
   public static void main(String[] args) {

     String name = JOptionPane.showInputDialog("Enter your name: "); // User's input for name

     String major = JOptionPane.showInputDialog("Enter your major: "); // User's input for major

     String email = JOptionPane.showInputDialog("Enter your e-mail: "); // User's input for email

     JOptionPane.showMessageDialog(null, "Name: " + name + "\n" + "Major: " + major + "\n" + "E-mail: " + email);

   }
 }
