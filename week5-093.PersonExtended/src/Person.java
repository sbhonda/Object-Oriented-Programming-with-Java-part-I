import java.util.Calendar;

public class Person 
{
    private String name;
    private MyDate birthday;
    
    public Person(String name, int dd, int mm, int yy) 
    {
        this.name = name;
        this.birthday = new MyDate(dd, mm, yy);
    }
    
    
    public Person(String name, MyDate birthday)
    {
        this.name = name;
        this.birthday = birthday;
    }
    
    public Person(String name)
    {
        this.name = name;
        this.birthday = new MyDate(Calendar.getInstance().get(Calendar.DATE), 
        Calendar.getInstance().get(Calendar.MONTH) + 1, 
        Calendar.getInstance().get(Calendar.YEAR));
    }
    
    
    public int age() 
    {
        // calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        MyDate currentDate = new MyDate(Calendar.getInstance().get(Calendar.DATE), 
        Calendar.getInstance().get(Calendar.MONTH) + 1, 
        Calendar.getInstance().get(Calendar.YEAR));
        
        return birthday.differenceInYears(currentDate);
    }
    
    
    public boolean olderThan(Person compared) 
    {
        if(this.birthday.earlier(compared.birthday))
            return true;
        else
            return false;
    }
    
    
    public String getName() 
    {
        return this.name;
    }
    
    
    public String toString() 
    {
        return this.name + ", born " + this.birthday;
    }
}
