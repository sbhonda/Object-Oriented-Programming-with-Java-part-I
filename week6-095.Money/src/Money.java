
public class Money 
{

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) 
    {
        if (cents > 99) 
        {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }
    

    public int euros() 
    {
        return euros;
    }

    
    public int cents() 
    {
        return cents;
    }


    public String toString() 
    {
        String zero = "";
        
        if (cents < 10) 
            zero = "0";

        return euros + "." + zero + cents + "e";
    }
    
    
    public Money plus(Money added)
    {
        int newCents = cents + added.cents;
        int newEuros = euros + added.euros;
        
        if (newCents > 99) 
        {
            newEuros += newCents / 100;
            newCents %= 100;
        }
         
        Money newMoney = new Money(newEuros, newCents);
        return newMoney;
    }
    

    public boolean less(Money compared)
    {
        if (this.cents + (this.euros * 100) < compared.cents + (compared.euros * 100))
            return true;
        return false;       
    }
    
    
    public Money minus(Money decremented)
    {
        int newCents = cents - decremented.cents;
        int newEuros = euros - decremented.euros;
        
        if (newCents < 0) 
        {
            newEuros--;
            newCents += 100;
        }
         
        Money newMoney = new Money(newEuros, newCents);
        
        if (newEuros < 0)
            return new Money(0,0);
        else
            return newMoney;
    }
}
