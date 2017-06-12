
public class Greatest 
{

    public static int greatest(int number1, int number2, int number3) 
    {
        int greater;
        
        if (number1 > number2)
            greater = number1;
        else
            greater = number2;
        
        if (number3 > greater)
            return number3;
        else
            return greater;       
    }

    public static void main(String[] args) 
    {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}