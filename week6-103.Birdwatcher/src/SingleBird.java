
/**
 *
 * @author shelley
 */
public class SingleBird
{
    private String name;
    private String latinName;
    private int count;


    public SingleBird(String name, String latinName)
    {
        this.name = name;
        this.latinName = latinName;
        this.count = 0;
    }
    
    public String name()
    {
        return this.name;
    }
    
    public void observed()
    {
        this.count++;
    }

    public String toString()
    {
        return this.name + " (" + this.latinName +  ") : " + this.count + " observations";
    }
}
