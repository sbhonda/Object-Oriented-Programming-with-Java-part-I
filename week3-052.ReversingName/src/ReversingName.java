import java.util.Scanner;

public class ReversingName 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type your name: ");
        String name = reader.nextLine();

        int charCounter = 1;
            
        while (charCounter <= name.length()) 
        {
            System.out.print(name.charAt(name.length() - charCounter));
            charCounter++;
        }
        
        System.out.println("");
    }
}
