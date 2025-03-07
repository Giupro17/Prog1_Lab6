import java.util.Random;
import java.util.ArrayList;
import java.util.HashMap;

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
    private HashMap<String,String> responseMap;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        rand_gen = new Random(); 
        responses = new ArrayList<>();
        responseMap = new HashMap<>();
        fillResponsesMap();
        fillResponses();
        
    }
    private void fillResponsesMap(){
        responseMap.put("crash","try to reboot your computer");

    }
    
    private String pickDefaultResponse(){
        return "No idea, sorry";
        
    }
    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String word)
    {
        String response = responseMap.get(word);
        if (response == null){
            response = pickDefaultResponse();
        }
        return response;
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