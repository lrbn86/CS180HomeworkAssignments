import javax.swing.JOptionPane;

/**
 * CitationMachine.java
 *
 * A GUI program that reads the following information on a book:
 * author name, year of publication, title, location, and publisher.
 * The program generates the citation string for this book in an APA format.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version September 3, 2016
 *
 */
public class CitationMachine {
  /**
   * Program's main entry point
   *
   * @param args the parameter (array of strings) for the main method
   */
  public static void main(String[] args) {

    JOptionPane.showMessageDialog(null, "Enter book details to generate APA format citation.");

    String authorName = JOptionPane.showInputDialog("Author name: "); // User's input for author's name

    String yearOfPublication = JOptionPane.showInputDialog("Year of publication: "); // User's input for year of publication

    String titleOfWork = JOptionPane.showInputDialog("Title of work: "); // User's input for title of work

    String publisher = JOptionPane.showInputDialog("Publisher: "); // User's input for publisher

    String location = JOptionPane.showInputDialog("Location: "); // User's input for location

    String authorLastName = authorName.substring(authorName.indexOf(" "), authorName.length()); // Author's last name

    String authorFirstNameInitial = authorName.substring(0, 1); // Author's first name initial

    JOptionPane.showMessageDialog(null, authorLastName + ", " + authorFirstNameInitial + ". " + "(" + yearOfPublication + "). " + titleOfWork + ". " + location + ": " + publisher + ".");
  }
}
