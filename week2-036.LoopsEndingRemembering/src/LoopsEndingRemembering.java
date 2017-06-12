import java.util.Scanner;

public class LoopsEndingRemembering 
{
    public static void main(String[] args) 
    {    
        Scanner reader = new Scanner(System.in);

        System.out.println("Type numbers: ");
        
        int sum = 0;
        int counter = 0;
        int oddCounter = 0;
        int evenCounter = 0;
        
        while (true)
        {
            int num = Integer.parseInt(reader.nextLine());             
            
            if (num != -1)
            {
                sum += num;
                counter++;
                
                if (num % 2 == 0)
                    evenCounter++;
                
                else
                    oddCounter++;
            }
            
            else if (num == -1)
            {
                double average = (double)sum / counter;
                System.out.println("Thank you and see you later!\n" +
                    "The sum is " + sum + "\n" +
                    "How many numbers: " + counter + "\n" +
                    "Average: " + average + "\n" +
                    "Even numbers: " + evenCounter + "\n" +
                    "Odd numbers: " + oddCounter);
                break;
            }
        }
    }
}
