/**
 * Test.java
 *
 * Test
 *
 * @author Brandon Nguyen, nguye299@purdue.edu, Lab Section G06
 *
 * @version October 12, 2016
 *
 */
public class Test {

    public static void main(String[] args) {
        char firstLetter = '[';
        if (firstLetter > 'Z') {
            firstLetter = (char) ((firstLetter - 'A') + 39);
        }
        System.out.println(firstLetter);
    }
}


/**
 * Purpose of Method
 * @param parameters (may be more than one)
 * @return (if not void)
 * Methods*/