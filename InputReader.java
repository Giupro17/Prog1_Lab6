import java.util.HashSet;
import java.util.Scanner;

/**
 * InputReader reads typed text input from the standard text terminal. 
 * The text typed by a user is returned.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class InputReader
{
    private Scanner reader;

    /**
     * Create a new InputReader that reads text from the text terminal.
     */
    public InputReader()
    {
        reader = new Scanner(System.in);
    }

    /**
     * Read a line of text from standard input (the text terminal),
     * and return it as a String.
     *
     * @return  A String typed by the user.
     */
    public HashSet<String> getInput() //39
    {
        System.out.print("> ");
        String inputLine = reader.nextLine().trim().toLowerCase();
        String[] wordArray = inputLine.split(" ");
        HashSet<String> words = new HashSet<String>();
        for(String word : wordArray) {
            words.add(word);
        }

        return words;
    }
}
//39.  The for-each loop is more explicit and easier to understand. the Array.asList() method is shorter
// but it doesnt allow modifications to the resulting list directly.
// 40. Sorting, searching,comparison, filling, conversion