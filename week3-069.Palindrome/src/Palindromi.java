import java.util.Scanner;

public class Palindromi 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        
        if (palindrome(text)) 
            System.out.println("The text is a palindrome!");
        
        else 
            System.out.println("The text is not a palindrome!");        
    }
    
    public static boolean palindrome(String text) 
    {        
        String palindrome = "";
        int textCounter = 1;
            
        while (textCounter <= text.length()) 
        {
            palindrome += text.charAt(text.length() - textCounter);
            textCounter++;
        }
        
        return palindrome.equals(text);
    }  
}
