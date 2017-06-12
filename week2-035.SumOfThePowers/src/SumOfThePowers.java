
import java.util.Scanner;

public class SumOfThePowers 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int power = 0;
        int result = 0;
        
        while (power <= num)
        {
            result += (int)Math.pow(2, power);
            power++;
        }
        
        System.out.println("Result is " + result);       
    }
}
