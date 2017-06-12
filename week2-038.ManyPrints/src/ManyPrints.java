
import java.util.Scanner;

public class ManyPrints 
{
    // NOTE: do not change the method definition, e.g. add parameters to method
    public static void printText() 
    {
        System.out.println("In the beginning there were the swamp, the hoe and Java.");
    }

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        // ask the user how many times the text should be printed
        System.out.println("How many?");
        int num = Integer.parseInt(reader.nextLine());
        int counter = 0;
        
        // use the while structure to call the printText method several times
        while (counter < num)
        {
            printText();
            counter++;
        }
    }
}