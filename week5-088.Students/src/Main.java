
import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) 
    {        
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner reader = new Scanner(System.in);
        
        String name = "";
        String studentNumber = "";
        
        while (true)
        {
            System.out.print("name: ");
            name = reader.nextLine();
            if (name.isEmpty())
                break;
            
            System.out.print("studentnumber: ");
            studentNumber = reader.nextLine();
            
            list.add(new Student(name, studentNumber));    
        }
        
        for (Student current : list)
        {
            System.out.println(current);
        }
        
        System.out.print("Give search term: ");
        String searchTerm = reader.nextLine();
        
        for (Student current : list)
        {
            if (current.getName().contains(searchTerm))
            {
                System.out.println("Result: ");
                System.out.println(current);
            }
        }   
    }
}