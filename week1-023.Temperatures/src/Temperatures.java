
import java.util.Scanner;

public class Temperatures 
{
    public static void main(String[] args) 
    {

        Scanner reader = new Scanner(System.in);
        
        while (true)
        {
            System.out.print("What is the temperature? ");
            double temp = Double.parseDouble(reader.nextLine());
            
            if (temp >= -30 && temp <= 40)
                Graph.addNumber(temp);
            
            else if (temp < -30 || temp > 40)
                System.out.println("Please enter temp between -30 and 40.");
        }
    }
}