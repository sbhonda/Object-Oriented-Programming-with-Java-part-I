
public class NumberStatistics 
{
    private int amountOfNumbers;
    private int sum = 0;
    
    public NumberStatistics()
    {
        this.amountOfNumbers = 0;
    }
    
    public void addNumber(int number)
    {
        sum += number;
        this.amountOfNumbers++;
    }
    
    public int amountOfNumbers()
    {
        return this.amountOfNumbers;
    }
    
    public int sum()
    {
        return sum;
    }
    
    public double average()
    {
        if (this.amountOfNumbers > 0)
            return (double)sum / this.amountOfNumbers; 
        else
            return 0;
    }
}

