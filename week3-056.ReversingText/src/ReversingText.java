
import java.util.Scanner;

public class ReversingText 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
    
    public static String reverse(String text) 
    {
        // note that method does not print anything, it RETURNS the reversed string       
        int charCounter = 1;
        String holder = "";
            
        while (charCounter <= text.length()) 
        {
            holder = holder + text.charAt(text.length() - charCounter);
            charCounter++;
        }
        return holder;
    }  
}
