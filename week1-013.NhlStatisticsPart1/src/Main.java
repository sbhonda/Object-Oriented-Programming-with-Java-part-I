
import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Top ten by points");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
        System.out.println();
        
        System.out.println("Top 25 by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        
        System.out.println();
        
        System.out.println("Statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        
        System.out.println();
        
        System.out.println("Statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println();
        
        System.out.println("Anaheim Ducks players by points");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        System.out.println();        
    }
}
