/**
 * This class implements a technical support system. It is the top level class 
 * in this project. The support system communicates via text input/output 
 * in the text terminal.
 * 
 * This class uses an object of class InputReader to read input from the user,
 * and an object of class Responder to generate responses. It contains a loop
 * that repeatedly reads input and generates output until the users wants to 
 * leave.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class SupportSystem
{
    private InputReader reader;
    private Responder responder;
    
    /**
     * Creates a technical support system.
     */
    public SupportSystem()
    {
        reader = new InputReader();
        responder = new Responder();
    }

    /**
     * Start the technical support system. This will print a welcome
     * message and enter into a dialog with the user, until the user
     * ends the dialog.
     */
    public void start()
    {
        boolean finished = false;

        printWelcome();

        while(!finished) {
            String input = reader.getInput();
            input = input.trim();//8
            input = input.toLowerCase(); //9
            if(input.equals("bye")) { //11
                finished = true;
            }
            else {
                String response = responder.generateResponse();
                System.out.println(response);
            }
        }

        printGoodbye();
    }

    /**
     * Print a welcome message to the screen.
     */
    private void printWelcome()
    {
        System.out.println("Welcome to the DodgySoft Technical Support System.");
        System.out.println();
        System.out.println("Please tell us about your problem.");
        System.out.println("We will assist you with any problem you might have.");
        System.out.println("Please type 'bye' to exit our system.");
    }

    /**
     * Print a good-bye message to the screen.
     */
    private void printGoodbye()
    {
        System.out.println("Nice talking to you. Bye...");
    }
}
/*
 * 2.
 * 3. They have different parameters. the second one tests if it is the start of the string
 * 4. Yes, it is public boolean endsWith(String Suffix)
 * 5. public int length() 
 * 6. it is not hard but not easy because you have to scroll till you find the method that fits the description
 * 7. Public String trim(); ex: public String trim(String text)
 * 8. input = input.trim();
 * 9. input = input.toLowerCase();
 * 11.if(input.equals("bye"))
 * 13.
 * 14.
 */