import java.util.Scanner;

/**
 * Player.java
 *
 * The program gets the name, the major, and the e-mail of the user,
 * and then displays this information in a pop-up message of predefined format.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version 09/16/2016
 *
 */
public class Player {

  private String name; // Contains the name of the Player
  private double positionX; // Contains the horizontal distance from the origin to the position of the player
  private double positionY; // Contains the vertical distance from the origin to the position of the player

  /**
   * Sets the name of the player to the given name and sets the position of the
   * player to the default position, which is (0, 0). This constructor calls the
   * next constructor with the proper set of parameters.
   *
   * @param name name of the player
   */
  public Player(String name) {
    this.name = name;
    this.positionX = 0.0d;
    this.positionY = 0.0d;
  }

  /**
   * Sets the name of the player to the given name and sets the position of the
   * player to the position (positionX, positionY).
   *
   * @param name the name of the player
   * @param positionX the horizontal position of the player
   * @param positionY the vertical position of the player
   */
  public Player(String name, double positionX, double positionY) {
    this.name = name;
    this.positionX = positionX;
    this.positionY = positionY;
  }

  /**
   * Accessor for the field name
   *
   * @return a string representing the player's name
   */
  public String getName() {
    return this.name;
  }

  /**
   * Accessor for the field positionX
   *
   * @return a double representing the player's horizontal positionX
   */
  public double getPositionX() {
    return this.positionX;
  }

  /**
   * Accessor for the field positionY
   *
   * @return a double representing the player's vertical positionY
   */
  public double getPositionY() {
    return this.positionY;
  }

  /**
   * Modifies the name of the player to the given name
   *
   * @param name the name of the player
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Changes the X-position of the player by adding the offset value (offsetX)
   * to the data member of the player positionX
   *
   * @param offsetX the positionX value changed by the offsetX value
   */
  public void moveX(double offsetX) {
    this.positionX += offsetX;
  }

  /**
   * Changes the Y-position of the player by the adding the offset value (offsetY)
   * to the data member of the player positionY
   *
   * @param offsetY the positionY value changed by the offsetY value
   */
  public void moveY(double offsetY) {
    this.positionY += offsetY;
  }

  /**
   * Simulates the movement of the player from his current position to a new
   * position in a specific direction.
   *
   * @param theta expressed in degrees and is measured in a counterclockwise manner from the X-axis
   * @param distance the distance moved in the direction given (non-negative)
   */
  public void moveInDirection(double theta, double distance) {
    // TO-DO: Logical error - Incorrect output
    this.positionX = this.getPositionX() + distance * Math.cos(Math.toRadians(theta));
    this.positionY = this.getPositionY() + distance * Math.sin(Math.toRadians(theta));
  }

  /**
   * Checks if the position of this player is the same as the position of the
   * player given as an argument to the method. In same position if the distance
   * is less than 0.001.
   *
   * @param player the Player object
   * @return a boolean that represents whether the players are in the same position
   */
  public boolean hasSamePositionAs(Player player) {

    boolean result = false;

    if (this.distanceFrom(player) <= 0.001d) {
      result = true;
    } else {
      result = false;
    }

    return result;
  }

  /**
   * Computes the Euclidean distance (distance formula) between the position of this player to the
   * the position of the player given
   *
   * @param player the player object
   * @return a double representing the distance between the players
   */
  public double distanceFrom (Player player) {
    // TO-DO: Logical error - Incorrect output
    double result = Math.sqrt(Math.pow((player.getPositionX() - this.getPositionX()), 2) + Math.pow((player.getPositionY() - this.getPositionY()), 2));

    return result;
  }

  /**
   * Program's main entry point
   *
   * @param args console line argument
   */
  public static void main(String[] args) {

    Scanner sc = new Scanner (System.in); // Reads user's inputs

    // Asking and storing the information to player1 object
    System.out.println("What is the name of player 1:");
    String player1Name = sc.nextLine(); // Store given String to represent player1's name
    System.out.println("Enter the starting xPosition of " + player1Name);
    int player1XPos = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's initial x position
    System.out.println("Enter the starting yPosition of " + player1Name);
    int player1YPos = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's initial y position
    Player player1 = new Player(player1Name, player1XPos, player1YPos); // Create a player object named player1

    // Asking and storing the information of player2 object
    System.out.println("What is the name of player 2:");
    String player2Name = sc.nextLine(); // Store given String to represent player2's name
    System.out.println("Enter the starting xPosition of " + player2Name);
    int player2XPos = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's initial x position
    System.out.println("Enter the starting yPosition of " + player2Name);
    int player2YPos = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's intiial y position
    Player player2 = new Player(player2Name, player2XPos, player2YPos); // Create a player object named player2

    // Asking and storing the information of player1 for move simulation
    System.out.println("Enter " + player1.getName() + "\'s " + "horizontal move offset");
    int player1XOffset = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's x offset
    System.out.println("Enter " + player1.getName() + "\'s " + "vertical move offset");
    int player1YOffset = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's y offset
    System.out.println("Enter " + player1.getName() + "\'s " + "diagonal move angle degrees");
    int player1Angle = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's diagonal move angle degrees
    System.out.println("Enter " + player1.getName() + "\'s " + "diagonal move distance");
    int player1Distance = Integer.parseInt(sc.nextLine()); // Store given integer that represent player1's diagonal move distance

    // Asking and storing the information of player2 for move simulation
    System.out.println("Enter " + player2.getName() + "\'s " + "horizontal move offset");
    int player2XOffset = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's x offset
    System.out.println("Enter " + player2.getName() + "\'s " + "vertical move offset");
    int player2YOffset = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's y offset
    System.out.println("Enter " + player2.getName() + "\'s " + "diagonal move angle degrees");
    int player2Angle = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's diagonal move angle degrees
    System.out.println("Enter " + player2.getName() + "\'s " + "diagonal move distance");
    int player2Distance = Integer.parseInt(sc.nextLine()); // Store given integer that represent player2's diagonal move distance

    // Simulate movements for player1 and player2
    player1.moveX(player1XOffset);
    player2.moveX(player2XOffset);
    player1.moveY(player1YOffset);
    player2.moveY(player2YOffset);
    player1.moveInDirection(player1Angle, player1Distance);
    player2.moveInDirection(player2Angle, player2Distance);

    // Returns player1's position and player2's position as well as the distance between the two player objects
    // Also returns whether player1's position and player2's position are the same
    System.out.println(player1.getName() + "\'s position: " + "(" + String.format("%.5f", player1.getPositionX()) + ", " + String.format("%.5f", player1.getPositionY()) + ")");
    System.out.println(player2.getName() + "\'s position: " + "(" + String.format("%.5f", player2.getPositionX()) + ", " + String.format("%.5f", player2.getPositionY()) + ")");
    System.out.println("Distance between players: " + String.format("%.5f", player1.distanceFrom(player2)));
    System.out.println("Same position: " + player1.hasSamePositionAs(player2));
  }

}
