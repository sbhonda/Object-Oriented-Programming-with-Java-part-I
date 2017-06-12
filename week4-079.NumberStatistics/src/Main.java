import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {   
        Scanner reader = new Scanner(System.in);
        
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evenStats = new NumberStatistics();
        NumberStatistics oddStats = new NumberStatistics();
                
        System.out.println("Type numbers:");
        
        while (true)
        {
            int newNumber = Integer.parseInt(reader.nextLine());
            
            if (newNumber == -1)
                break;
            
            stats.addNumber(newNumber);

            if (newNumber % 2 == 0)
                evenStats.addNumber(newNumber);
            
            else
                oddStats.addNumber(newNumber);
        }
       
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evenStats.sum());
        System.out.println("sum of odd: " + oddStats.sum());
    }
}
