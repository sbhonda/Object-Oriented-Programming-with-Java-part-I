import java.util.ArrayList;

/**
 *
 * @author shelley
 */
public class Phonebook
{
    private ArrayList<Person> person;
    
    public Phonebook()
    {
        person = new ArrayList<Person>();
    }
        
    
    public void add(String name, String number)
    {
        Person newPerson = new Person(name, number);
        person.add(newPerson);
    }
    
    
    public void printAll()
    {
        for (Person nextPerson : person)
            System.out.println(nextPerson);
    }
    
    
    public String searchNumber(String name)
    {
        for (Person nextPerson : person)
        {
            if (nextPerson.getName().contains(name))
                return nextPerson.getNumber();
        }       
        return "number not known";
    }
}
