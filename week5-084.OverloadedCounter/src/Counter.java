/**
 *
 * @author shelley
 */
public class Counter 
{
    private int value;
    private boolean check;    
    
    public Counter(int startingValue, boolean check)
    {
        //creates a new counter with the given value. 
            //the check is on if the parameter given to check was true.
        this.value = startingValue;
        this.check = check;
        
    }
    
    public Counter(int startingValue)
    {
        //creates new counter with the given value. 
            //check on new counter should be off.
        this(startingValue, false);
        
    }
    
    public Counter(boolean check)
    {
        //create new counter with the starting value 0. 
            //The check is on if the parameter given to check was true.
        this(0, true);
    }
        
    public Counter()
    {
        //creates new counter with the starting value of 0 and checking off
        this(0);
    }
    
    public int value()
    {
        //reset current value of the counter
        return this.value;
    }
    
    public void increase()
    {
        this.value++;
    }
    
    public void decrease()
    {
        //decrease counter by one
            //but not below 0 if check is on
        if (this.value > 0 || !check)
            this.value--;
        else
            return;
    }
    
    public void increase(int increaseAmount)
    {
        //increases the value by the amount of the parameter
            //If the value of parameter is -,  value will not change.
        if (increaseAmount < 0)
            return;
        else
            this.value += increaseAmount;
    }
    
    public void decrease(int decreaseAmount)
    {
        //decreases the value of the counter by the amount given
            //but not below 0 if the check is on. 
            //If the value of parameter is -, counter will not change.
        if (decreaseAmount < 0)
            return;
        else if (this.value - decreaseAmount < 0 && check)
            this.value = 0;
        else
            this.value -= decreaseAmount;
    }
}
