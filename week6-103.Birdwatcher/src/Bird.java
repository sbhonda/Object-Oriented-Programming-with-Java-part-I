
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shelley
 */
public class Bird
{
    private ArrayList<SingleBird> birds;
    private String [] name;
    
    public Bird(Scanner scanner)
    {
        this.birds = new ArrayList<SingleBird>();
        this.name = new String[2];  
    }
    
    
    public void addBird(Scanner scanner)
    {          
        String[] whichName = new String[2];
        whichName[0] = "Name: ";
        whichName[1] = "Latin name: ";
        
        for (int i = 0; i < 2; i++)
        {
            System.out.print(whichName[i]);
            String birdName = scanner.nextLine();
            if (birdName != "")
                name[i] = birdName;
        }
        
        SingleBird newBird = new SingleBird(name[0], name[1]);
        birds.add(newBird);
    }
    
    
    public void getObservation(String name, Bird thisBird)
    {
        if (isBird(name) == true)
        {
            for (SingleBird nextBird : thisBird.birds) 
            {
                if (name.equals(nextBird.name())) 
                    nextBird.observed();            
            }
        }   
        else 
            System.out.println("Is not a bird!");    
    }
    
    
    public void statistics()
    {
        for (SingleBird nextBird : birds) 
        {
            String bird = nextBird.toString();
            System.out.println(bird);
        }
    }
    
    
    public void printBird(String name)
    {
        for (SingleBird nextBird : birds) 
        {
            if (name.equals(nextBird.name())) 
            {
                String bird = nextBird.toString();
                System.out.println(bird);
            }
        }          
    }
    
    
    public boolean isBird(String name)
    {
        for (SingleBird nextBird : birds) 
        {
            if (name.equals(nextBird.name())) 
                return true;
        }  
        return false;
    } 
}


        