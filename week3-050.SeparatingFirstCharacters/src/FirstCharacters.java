import java.util.Scanner;

public class FirstCharacters 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
     
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        
        if (name.length() >= 3)
        {
            int charCounter = 0;
            
            while (charCounter < 3) 
            {
                System.out.println((charCounter + 1) + ". character: " + name.charAt(charCounter));
                charCounter++;
            }
        }
    }   
}
