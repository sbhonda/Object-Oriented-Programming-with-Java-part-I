
import hangman.Hangman;
import java.util.Scanner;

public class HangmanUserInteface 
{

    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        Hangman hangman = new Hangman();

        System.out.println("***********\n" +
                            "* HANGMAN *\n" +
                            "***********\n\n");
        printMenu();
        System.out.println();

        while (hangman.gameOn())
        {
            System.out.println("Type a command: ");
            String command = reader.nextLine();
            if (command.equals("quit"))
                break;
            
            if(command.equals("status"))
                hangman.printStatus();
            
            if (command.length() == 1)
                hangman.guess(command);
      
            if (command.length() == 0)
                printMenu();
          
            else
            {
                hangman.printMan();
                hangman.printWord();
            }
        }


        System.out.println("Thank you for playing!");
    }

    public static void printMenu() 
    {
        System.out.println("* menu *\n" +
                            "quit   - quits the game\n" +
                            "status  - prints the game status\n" +
                            "a single letter uses the letter as a guess\n" +
                            "an empty line prints this menu\n");
    }
}

