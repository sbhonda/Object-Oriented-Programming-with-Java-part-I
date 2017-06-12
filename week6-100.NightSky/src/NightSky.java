
import java.util.Random;

/**
 *
 * @author shelley
 */
public class NightSky
{
    private double density;
    private int width;
    private int height;
    private int starCount;
    
    public NightSky(double density, int width, int height)
    {
        this.density = density;
        this.width = width;
        this.height = height;
    }
    
    
    public NightSky(int width, int height)
    {
        this.density = .1;
        this.width = width;
        this.height = height;
    }
    
    
    public NightSky(double density)
    {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }
    
    
    public void printLine()
    {   
        for (int i = 0; i < this.width; i++)
        {
            Random random = new Random();
            
            int probability = (int)(this.density * 10);
            int randomNum = random.nextInt(9) + 1;
            
            if (probability >= randomNum)
            {
                System.out.print("*");
                starCount++;
            }
                
            else
                System.out.print(" ");
        }
        System.out.println("");
    }
    
    
    public void print()
    {
        for (int j = 0; j < this.height; j++)
            printLine();
    }
    
    
    public int starsInLastPrint()
    {
        int count = this.starCount;
        this.starCount = 0;
        return count;
    }
}
