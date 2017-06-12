
import java.util.Scanner;

public class Divider 
{
    public static void main(String[] args) 
    {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number: ");
        int num1 = Integer.parseInt(reader.nextLine());

        System.out.print("Type another number: ");
        int num2 = Integer.parseInt(reader.nextLine());

        double division = (double)num1 / num2;

        String toPrint = "Division: " + num1 + " / " + num2 + " = " + division;
        System.out.println(toPrint);
    }
}
