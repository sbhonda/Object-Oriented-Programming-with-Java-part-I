public class MyDate 
{
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) 
    {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    
    public String toString() 
    {
        return this.day + "." + this.month + "." + this.year;
    }

    
    public boolean earlier(MyDate compared) 
    {
        if (this.year < compared.year)
            return true;

        if (this.year == compared.year && this.month < compared.month)
            return true;

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) 
            return true;

        return false;
    }

        
    public int differenceInYears(MyDate comparedDate)
    {
        int dateInDays = (this.year * 365) + (this.month * 30) + this.day;
        int comparedInDays = (comparedDate.year * 365) + (comparedDate.month * 30) + comparedDate.day;
        
        return Math.abs((dateInDays - comparedInDays)/365);
        // return Math.abs(this.year - comparedDate.year);
    }
}
