
import java.util.Scanner;

public class SumOfThreeNumbers 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;
        
        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;
        
        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;

        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum = read + sum;  

        System.out.println("Sum: " + sum);
    }
}
