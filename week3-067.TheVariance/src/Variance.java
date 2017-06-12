import java.util.ArrayList;

public class Variance 
{
    public static void main(String[] args) 
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) 
    {
        int sum = 0;
        
        for (int next : list)
            sum += next;
        
        return sum;
    }
    
    // Copy here average from exercise 64 
    public static double average(ArrayList<Integer> list) 
    {
        double count = list.size();
        return sum(list) / count;
    }

    public static double variance(ArrayList<Integer> list) 
    {
        // find sum of (list.get(x) - average(list))^2
        double sum2 = 0;
        int index = 0;
        double mean = average(list);
        
        for (int value : list)
        {
            sum2 += Math.pow((list.get(index) - mean), 2);
            index++;       
        }
        
        int listSize = list.size();
        
        return sum2 / (listSize - 1);
    }
}
