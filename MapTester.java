import java.util.HashMap;

/**
 * Write a description of class MapTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MapTester
{
    // instance variables - replace the example below with your own
    private int x;
    private HashMap <String,String> contact; //27

    /**
     * Constructor for objects of class MapTester
     */
    public MapTester()
    {
        contact = new HashMap<>();
        contact.put("Donald Trump","514 355 6765");
        contact.put("Shamba", "514 667 8796");
        contact.put("Dylan", "514 699 6969");
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void enterNumber(String name, String number)
    {
        contact.put(name,number);
    }
    
    public String lookupNumber(String name){
        String number = contact.get(name);
        return number;
    }
        
    }

/*
 * 24. HashMap is implementing the method interface. Its used for to provide null
 */