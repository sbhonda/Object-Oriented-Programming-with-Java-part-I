
import java.util.Scanner;

public class Main 
{  

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        Bird birds = new Bird(scanner);
        
        while (true)
        {
            System.out.print("? ");
            String command = scanner.nextLine();

            if (command.equals("Quit"))
                break;
            
            else if (command.equals("Add"))
                birds.addBird(scanner);
            
            else if (command.equals("Observation"))
            {
                System.out.print("What was observed? ");
                String name = scanner.nextLine();
                birds.getObservation(name, birds);
            }

            else if (command.equals("Show"))
            {
                System.out.print("What? ");
                String name = scanner.nextLine();
                birds.printBird(name);
            }
            
            else if (command.equals("Statistics"))
                birds.statistics();        
        }
    }
}
