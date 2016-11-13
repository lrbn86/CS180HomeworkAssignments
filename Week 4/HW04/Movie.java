/**
 * Movie.java
 *
 * This program compares two Movies.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version 09/23/2016
 *
 */
public class Movie {

  private String name; // Contains the name of the movie
  private double criticRating; // Represents a rating given to the movie by professionals. (Range: [1, 5])
  private double usersRating; // Represents the average users' rating who watched the movie. (Range: [1, 5])
  private int numUsersRatings; // Contains the number of users who supplied a rating for this movie. (Must be >= 0)

  /**
   * Checks that the values supplied for criticRating and average usersRating are in the proper range from 1 (inclusive)
   * to 5 (inclusive). If any of the values (for criticRating and usersRating) are not in the correct range, default to 5
   *
   * @param name name of Movie
   * @param criticRating rating of the Movie by critics
   * @param usersRating rating of the Movie by users
   * @param numUsersRatings number of users that supplied a rating of the Movie
   */
  public Movie(String name, double criticRating, double usersRating, int numUsersRatings) {
    this.name = name;
    this.criticRating = criticRating;
    this.usersRating = usersRating;
    this.numUsersRatings = numUsersRatings;

    if (!((criticRating >= 1) && (criticRating <= 5)) && !((usersRating >= 1) && (usersRating <= 5))) {
      criticRating = 5;
      usersRating = 5;
    }
  }

  /**
   * Accessor for the field name
   *
   * @return a string representing the name of the Movie
   */
  public String getName() {
    return this.name;
  }

  /**
   * Accessor for the field criticRating
   *
   * @return a double representing the criticRating of the Movie
   */
  public double getCriticRating() {
    return this.criticRating;
  }

  /**
   * Accessor for the field usersRating
   *
   * @return a double representing the usersRating of the Movie
   */
  public double getUsersRating() {
    return this.usersRating;
  }

  /**
   * Accessor for the field numUsersRatings
   *
   * @return an integer representing the numUsersRatings of the Movie
   */
  public int getNumUsersRatings() {
    return this.numUsersRatings;
  }

  /**
   * Checks if given value is between [1,5] and appropriately updates usersRating and numUsersRatings as well as return
   * true. If given value is not between [1,5], then usersRating and numUsersRatings stays the same and returns false.
   *
   * @param newRating a value used to update usersRating if it is between [1,5]
   * @return a boolean representing whether the given value lies between [1,5]
   */
  public boolean addUserRating(int newRating) {

    if (newRating >= 1 && newRating <= 5) {
      this.numUsersRatings++;
      this.usersRating = newRating;

      return true;
    } else {
      return false;
    }
  }

  /**
   * Compares the two given movies
   *
   * @param movie1 a Movie object
   * @param movie2 a Movie object
   * @return an integer representing the comparison of movie1 and movie2
   */
  public static int compareMovies (Movie movie1, Movie movie2) {

    int movie1ReviewRange = 0;
    int movie2ReviewRange = 0;

    // Return 1 if movie1 is better, else return 2 for movie2
    int result = 0;
    if (movie1.getCriticRating() > movie2.getCriticRating() && movie1.getUsersRating() >= movie2.getUsersRating()) {
      result = 1;
    } else {
      result =  2;
    }

    // Calculate Review Range of each movies
    if (movie1.getNumUsersRatings() >= 0 && movie1.getNumUsersRatings() <= 1000) {
      movie1ReviewRange = 1;
    } else if (movie1.getNumUsersRatings() >= 1001 && movie1.getNumUsersRatings() <= 5000) {
      movie1ReviewRange = 2;
    } else if (movie1.getNumUsersRatings() >= 5001 && movie1.getNumUsersRatings() <= 10000) {
      movie1ReviewRange = 3;
    } else if (movie1.getNumUsersRatings() >= 10001 && movie1.getNumUsersRatings() <= 15000) {
      movie1ReviewRange = 4;
    } else if (movie1.getNumUsersRatings() >= 15001 && movie1.getNumUsersRatings() <= 20000) {
      movie1ReviewRange = 5;
    } else if (movie1.getNumUsersRatings() >= 20001 && movie1.getNumUsersRatings() <= 25000) {
      movie1ReviewRange = 6;
    } else if (movie1.getNumUsersRatings() >= 25001 && movie1.getNumUsersRatings() <= 30000) {
      movie1ReviewRange = 7;
    } else if (movie1.getNumUsersRatings() >= 30001 && movie1.getNumUsersRatings() <= 50000) {
      movie1ReviewRange = 8;
    } else if (movie1.getNumUsersRatings() >= 50001 && movie1.getNumUsersRatings() <= 100000) {
      movie1ReviewRange = 9;
    } else if (movie1.getNumUsersRatings() > 100000) {
      movie1ReviewRange = 10;
    }

    if (movie2.getNumUsersRatings() >= 0 && movie2.getNumUsersRatings() <= 1000) {
      movie1ReviewRange = 1;
    } else if (movie2.getNumUsersRatings() >= 1001 && movie2.getNumUsersRatings() <= 5000) {
      movie1ReviewRange = 2;
    } else if (movie2.getNumUsersRatings() >= 5001 && movie2.getNumUsersRatings() <= 10000) {
      movie1ReviewRange = 3;
    } else if (movie2.getNumUsersRatings() >= 10001 && movie2.getNumUsersRatings() <= 15000) {
      movie1ReviewRange = 4;
    } else if (movie2.getNumUsersRatings() >= 15001 && movie2.getNumUsersRatings() <= 20000) {
      movie1ReviewRange = 5;
    } else if (movie2.getNumUsersRatings() >= 20001 && movie2.getNumUsersRatings() <= 25000) {
      movie1ReviewRange = 6;
    } else if (movie2.getNumUsersRatings() >= 25001 && movie2.getNumUsersRatings() <= 30000) {
      movie1ReviewRange = 7;
    } else if (movie2.getNumUsersRatings() >= 30001 && movie2.getNumUsersRatings() <= 50000) {
      movie1ReviewRange = 8;
    } else if (movie2.getNumUsersRatings() >= 50001 && movie2.getNumUsersRatings() <= 100000) {
      movie1ReviewRange = 9;
    } else if (movie2.getNumUsersRatings() > 100000) {
      movie1ReviewRange = 10;
    }

    double movie1SmartScore = 0.5 * movie1.getCriticRating() + 0.3 * movie1.getUsersRating() + 0.1 * movie1ReviewRange;
    double movie2SmartScore = 0.5 * movie2.getCriticRating() + 0.3 * movie2.getUsersRating() + 0.1 * movie2ReviewRange;

    // In case a movie has a higher criticRating and a lower usersRating than the other movie, a score is computed for each of the two movies
    if (movie1.getCriticRating() > movie2.getCriticRating() && movie1.getUsersRating() < movie2.getUsersRating()) {

      if (movie1SmartScore > movie2SmartScore) {
        result = 1;
      }

    } else {

      if (movie2SmartScore > movie1SmartScore) {
        result = 2;
      }

    }

    if (movie1.getCriticRating() == movie2.getCriticRating() && movie1.getUsersRating() > movie2.getUsersRating()) {
      result = 1;
    } else if (movie2.getCriticRating() == movie1.getCriticRating() && movie2.getUsersRating() > movie1.getUsersRating()) {
      result = 2;
    } else if (movie1.getCriticRating() == movie2.getCriticRating() && movie1.getUsersRating() == movie2.getUsersRating()) {
      result = 0;
    }

    return result;
  }

  /**
   * Program's main entry point
   *
   * @param args console line argument
   */
  public static void main(String[] args) {
    Movie movie1 = new Movie ("Gatsby", 5, 5, 10);
    Movie movie2 = new Movie ("Room", 2, 5, 23);

    System.out.println(compareMovies(movie1, movie2));
  }


}
