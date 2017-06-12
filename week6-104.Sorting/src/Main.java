
import java.util.Arrays;


public class Main 
{
    public static void main(String[] args) 
    {
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);  
        System.out.println(Arrays.toString(values)); 
    }

    
    public static int smallest(int[] array)
    {
        int smallest = array[0];
        
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] < smallest)
                smallest = array[i];
        }
        return smallest;
    }
    
    
    public static int indexOfTheSmallest(int[] array)
    {
        int index = 0;

        while (true)
        {
            if (array[index] == smallest(array))
                break;
            index++;
        }
        return index;
        
    }
    
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index)
    {
        int smallestIndexFrom = index;
        
        for (int i = index; i < array.length; i++)
        {
            if (array[i] < array[smallestIndexFrom])
                smallestIndexFrom = i;
        }        
        return smallestIndexFrom;
    }
    
    
    public static void swap(int[] array, int index1, int index2)
    {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
    
    
    public static void sort(int[] array) 
    {
        for (int i = 0; i < array.length; i++)
        {
            if (array[i] != array[indexOfTheSmallestStartingFrom(array, i)])
                swap(array, i, indexOfTheSmallestStartingFrom(array, i));
        }
    }
}
