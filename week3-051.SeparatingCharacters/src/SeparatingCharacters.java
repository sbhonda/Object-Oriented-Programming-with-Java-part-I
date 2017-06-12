
import java.util.Scanner;

public class SeparatingCharacters 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
    
        System.out.print("Type your name: ");
        String name = reader.nextLine();
                
        int charCounter = 0;
            
        while (charCounter < name.length()) 
        {
            System.out.println((charCounter + 1) + ". character: " + name.charAt(charCounter));
            charCounter++;
        }
    }
}
