
import java.util.ArrayList;

/**
 *
 * @author shelley
 */
public class Team 
{
    private String name;
    private int maxSize = 16;
    private ArrayList<Player> players;
    
    public Team(String name)
    {
        this.name = name;
        players = new ArrayList<Player>();
    }
    
    
    public String getName()
    {
        return this.name;
    }
    
    
    public void addPlayer(Player newPlayer)
    {
        if (this.size() < this.maxSize)
            players.add(newPlayer);       
    }
    
    
    public void printPlayers()
    {
        for (Player player : players)
        {
            System.out.println(player);
        }
    }
    
    
    public void setMaxSize(int maxSize)
    {
        this.maxSize = maxSize;       
    }
    
    
    public int size()
    {
        return players.size();        
    }
    
    
    public int goals()
    {
        int teamGoals = 0;
        
        for (Player player : players)
            teamGoals += player.goals();
        
        return teamGoals;
    }
}
