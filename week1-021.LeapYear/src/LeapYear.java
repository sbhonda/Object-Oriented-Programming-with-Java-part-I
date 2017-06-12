
import java.util.Scanner;

public class LeapYear 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a year: ");
        int year = Integer.parseInt(reader.nextLine());
        
        int mod4 = year % 4;
        int mod100 = year % 100;
        int mod400 = year % 400;
        
        if (mod4 == 0 && mod100 != 0)
            System.out.println("This year is a leap year.");

        else if (mod100 == 0 && mod400 == 0)
            System.out.println("This year is a leap year.");
        
        else
            System.out.println("This year is not a leap year.");
    }
}
