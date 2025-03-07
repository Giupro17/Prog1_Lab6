import java.util.Random;
import java.util.ArrayList;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2016.02.29)
 */
public class Responder
{
    private ArrayList<String> responses; //22
    private Random rand_gen;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        responses = new ArrayList<>();
        fillResponses();
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        return "That sounds interesting. Tell me more...";
    }
        
    private void fillResponses(){
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("Ill ask my mom");
        responses.add("I don't know");
        responses.add("We'll see");
}
}