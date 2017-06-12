/**
 *
 * @author shelley
 */
public class BoundedCounter 
{
    private int value = 0;
    private int upperLimit;
    
    public BoundedCounter(int upperLimit)
    {
        this.upperLimit = upperLimit;
    }
    
    public void next()
    {
        if (this.value < this.upperLimit)
            this.value++;
        
        else
            this.value = 0;
    }
    
    public String toString()
    {
        return String.format("%02d", this.value);
    }
    
    public int getValue()
    {
        return this.value;
    }
    
    public void setValue(int newValue)
    {
        if (newValue >= 0 && newValue <= upperLimit)
            this.value = newValue;
    }
}
