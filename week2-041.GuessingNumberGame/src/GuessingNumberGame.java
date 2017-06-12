
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();

        int guessCounter = 0;
        
        while (true)
        {
            
            System.out.print("Guess a number: ");
            int number = Integer.parseInt(reader.nextLine());
        
            if (number < numberDrawn)
            {
               guessCounter++;
               System.out.println("The number is greater, guesses made: " + guessCounter);              
            }
        
            else if (number > numberDrawn)
            {
               guessCounter++;
               System.out.println("The number is lesser, guesses made: " + guessCounter);
            }
        
            else
            {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
