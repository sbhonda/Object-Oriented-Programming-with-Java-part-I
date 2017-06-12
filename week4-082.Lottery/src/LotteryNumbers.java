import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers 
{
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() 
    {
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() 
    {
        return this.numbers;
    }

    public void drawNumbers() 
    {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        int numCounter = 0;
        int newNumber = 0;
        
        while (numCounter < 7)
        {
            newNumber = this.random.nextInt(39) + 1;
            
            if (!containsNumber(newNumber))
            {
                this.numbers.add(newNumber);
                numCounter++;
            }
        }
    }

    public boolean containsNumber(int number) 
    {
        return this.numbers.contains(number);
    }
}