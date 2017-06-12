
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author shelley
 */
public class Grades
{
    
    public ArrayList<Integer> scores;
    private int[] gradeNum;
    Scanner scanner;    
    
    public Grades(Scanner scanner)
    {
        //initialize the count of each of the 6 grades to 0
        this.gradeNum = new int[6];

        for (int i = 0; i < 6; i++) 
            gradeNum[i] = 0;
    }
    
    
    public void getScores(Scanner scanner)
    {
        //creates an ArrayList of scores
        scores = new ArrayList<Integer>();
        
        System.out.println("Type exam scores, -1 completes:");
        
        while (true)
        {
            int score = Integer.parseInt(scanner.nextLine());

            if (score == -1)
                break;
            else
            {
                if (score >= 0 && score <= 60)
                    scores.add(score);
            }
        }
    }
    
    
    public int gradeConvert(int score) 
    {
            
            if (score < 30 && score >= 0)
                return 0;
        
            else if (score > 29 && score < 35)
                return 1;

            else if (score > 34 && score < 40)
                return 2;

            else if (score > 39 && score < 45)
                return 3;

            else if (score > 44 && score < 50)
                return 4;
        
        return 5;
    }
        
    
    public void gradeSum()
    {        
        for (int nextGrade : scores)    
        { 
            int grade = gradeConvert(nextGrade);
                                        
            for (int j = 0; j < 6; j++)
            {
                if (grade == j)
                    this.gradeNum[j]++;
            }
        }
    }
    
    
    public void gradePrint()
    {
        for (int k = 0; k < 6; k++) 
            System.out.println(this.gradeNum[k]);
    }
    
    
    public void gradeDistribution()
    {
        System.out.println("Grade distribution:");
        
        for (int k = 0; k < 6; k++) 
        {
            System.out.print(k + ": ");
            
            for (int l = 0; l < this.gradeNum[k]; l++)
                System.out.print("*");
            
            System.out.println("");
        }
        
        double accepted = 0.0;
        if (scores.size()- gradeNum[0] <= 0)
            accepted = 0;
        else
            accepted = (scores.size() - gradeNum[0])*100 / scores.size();
            
        String s = String.format("%.1f", accepted);
        System.out.println("Acceptance percentage: " + s);
    }   
}
