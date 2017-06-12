import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int count = 1;
        int product = 1;
        
        while (count <= num)
        {
            product *= count;
            count++;
        }
        
        System.out.println("Factorial is " + product);
    }
}
