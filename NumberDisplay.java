
/**
 * Write a description of class NumberDisplay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NumberDisplay
{
    // instance variables - replace the example below with your own
    private int display;
    private int maxDisplay;

    /**
     * Constructor for objects of class NumberDisplay
     */
    public NumberDisplay(int displayValue)
    {
        // initialise instance variables
        maxDisplay = displayValue;
        display = 0;
    }
    public void setValue(int value)
    {
        display =  value;
    }
    public  int getValue()
    {   
        return display;
    }
    public void increment()
    {
        if (display<=maxDisplay)
        {
            display++;
        }
        else
        {
            display = 0;
        }
    }
    public String getDisplay()
    {
        if(display<10)
        {   
            String completDisplay = "0" + display;
            return completDisplay;
        }
        else
        {
            String completDisplay = "" + display ;
            return completDisplay;
        }
    }
}


