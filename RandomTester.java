import java.util.Random;
import java.util.ArrayList;

/**
 * Write a description of class RandomTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RandomTester
{
    // instance variables - replace the example below with your own
    private Random rand_gen;
    private ArrayList<String> responses;

    /**
     * Constructor for objects of class RandomTester
     */
    public RandomTester()
    {
        // initialise instance variables
        rand_gen = new Random();
        responses = new ArrayList<>();
        fillResponses();

    }
    
    private void fillResponses(){ //22
        responses.add("yes");
        responses.add("no");
        responses.add("maybe");
        responses.add("Ill ask my mom");
        responses.add("I don't know");
        responses.add("We'll see");
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void printOneRandom()
    {
        // put your code here
        System.out.println("New integer:" + rand_gen.nextInt(1000));
    }
    
    public void printMultiRandom(int howMany){
        int index = 0;
        while (index < howMany){
            printOneRandom();
            index++;
        }
        
    }
    
    public String getResponse(){  //18
        int index = rand_gen.nextInt(3);
        
        if (index == 0 ){
            return "yes";
        } else if (index == 1) {
            return "no";
        } else{
            return "maybe";
        }
    }
    
    public String getBetterResponse(int index){
        index = rand_gen.nextInt(responses.size());
        
        return responses.get(index); 
    }
    }

