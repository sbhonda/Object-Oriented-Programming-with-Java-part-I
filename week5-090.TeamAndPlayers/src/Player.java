/**
 *
 * @author shelley
 */
public class Player 
{
    private int goals;
    private String playerName;
    
    public Player(String name)
    {
        this(name, 0);
    }
    
    
    public Player(String name, int goals)
    {
        this.playerName = name;
        this.goals = goals;
    }
    
    
    public String getName()
    {
        return this.playerName;
    }
    
    
    public int goals()
    {
        return this.goals;
    }
    
    
    public String toString()
    {
        return this.playerName + ", goals " + this.goals;
    }
}
