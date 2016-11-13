import java.util.Scanner;

/**
 * ArrayBuilder.java
 *
 * Populate a special-ordered array based on given base letter, rows, and columns.
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version October 08, 2016
 *
 */
public class ArrayBuilder {

    private char[][] letterArray; // an array of letters (characters)
    private char baseLetter; // a character representing a base letter
    private int row; // the number of rows
    private int col; // the number of columns

    /**
     * Initialize an ArrayBuilder object
     *
     * @param baseLetter a base letter in the alphabet
     * @param n number of rows
     * @param m number of columns
     */
    public ArrayBuilder(char baseLetter, int n, int m) {
        this.baseLetter = baseLetter;
        this.row = n;
        this.col = m;
        this.letterArray = new char[row][col];
    }

    /**
     * Copy Constructor
     *
     * @param arrayBuilder an arrayBuilder object
     */
    public ArrayBuilder(ArrayBuilder arrayBuilder) {
        this.baseLetter = arrayBuilder.baseLetter;
        this.letterArray = arrayBuilder.letterArray;
    }

    /**
     * Build the array using certain specifications
     *
     * Each letter should be followed by its consequent letter in the alphabet
     * in both vertical and horizontal directions. Go back to A after reaching Z.
     *
     * Horizontally, the order goes from left to right, following the array indexes.
     * Vertically, the order goes from top to bottom, following array indexes.
     */
    public void build() {

        for (int row = 0; row < this.letterArray.length; row++) {

            char firstLetterInRow = this.baseLetter;
            char baseLetter = this.baseLetter;

            for (int col = 0; col < this.letterArray[row].length; col++) {
//
//                if (Character.isUpperCase(firstLetterInRow) && (firstLetterInRow + row) > 'Z') {
//                    firstLetterInRow = (char) (firstLetterInRow - 26);
//                } else if (Character.isLowerCase(firstLetterInRow) && (firstLetterInRow + row) > 'z') {
//                    firstLetterInRow = (char) (firstLetterInRow - 26);
//                } else if ((firstLetterInRow + row) > 'Z'){
//                    firstLetterInRow = (char) (firstLetterInRow - 26);
//                } else if ((firstLetterInRow + row) > 'z'){
//                    firstLetterInRow = (char) (firstLetterInRow - 26);
//                }


                if (Character.isUpperCase(firstLetterInRow)) {

                    if ((firstLetterInRow + row) > 'Z') {
                        firstLetterInRow = (char) (firstLetterInRow - 26);
                    }

                } else if (Character.isLowerCase(firstLetterInRow)) {

                    if ((firstLetterInRow + row) > 'z') {
                        firstLetterInRow = (char) (firstLetterInRow - 26);
                    }

                } else if ((Character.isUpperCase(baseLetter))) {
                    if ((firstLetterInRow + row) > 'Z') {
                        firstLetterInRow = (char) (firstLetterInRow - 26);
                    }
                } else if ((Character.isLowerCase(baseLetter))) {
                    if ((firstLetterInRow + row) > 'z') {
                        firstLetterInRow = (char) (firstLetterInRow - 26);
                    }
                }


                letterArray[row][col] = (char) (firstLetterInRow + row);
                firstLetterInRow++;

                letterArray[0][0] = baseLetter;
            }

        }
    }

    /**
     * Return a copy of the array that has been built
     *
     * @return a character 2D array representing a letter array
     */
    public char[][] getLetterArray() {

        ArrayBuilder temp = new ArrayBuilder(this.baseLetter, this.row, this.col);
        ArrayBuilder copy = new ArrayBuilder(temp);
        return copy.letterArray;
    }

    /**
     * Helper method to visualize the contents of an array and test correctness
     */
    public void printLetterArray() {
        for (int row = 0; row < this.letterArray.length; row++) {
            for (int col = 0; col < this.letterArray[row].length; col++) {
                System.out.print(letterArray[row][col]);
            }
            System.out.println();
        }
    }

    /**
     * Program's main entry point
     *
     * @param args command-line arguments
     * */
    public static void main(String[] args) {

        // Use a simple main method to make several different calls to
        // ArrayBuilder and observe the output of the program after a call to
        // build(). Write own test cases.

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a base letter: ");
        char baseLetter = sc.nextLine().charAt(0);

        System.out.println("Enter the number of rows: ");
        int numOfRows = Integer.parseInt(sc.nextLine());

        System.out.println("Enter the number of columns: ");
        int numOfCols = Integer.parseInt(sc.nextLine());

        ArrayBuilder a = new ArrayBuilder(baseLetter, numOfRows, numOfCols);
        a.build();
        a.printLetterArray();

        // Using Copy
        // Where the modifying the copy array would not affect the original array
        // As seen in toString(), the memory locations are different
        // System.out.println(a.getLetterArray()); // Original
        // System.out.println(a.getLetterArray().toString()); // Copy


    }
}