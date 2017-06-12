
public class CashRegister 
{
    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() 
    {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000; 
    }

    
    public double payEconomical(double cashGiven) 
    {
        // price of the economical lunch is 2.50 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 2.50)
        {
            // the price of lunch is added to register
            this.cashInRegister += 2.50;
            // the amount of sold lunch is incremented by one
            this.economicalSold++;
            // method returns cashGiven - lunch price 
            return cashGiven - 2.50;
        }
        
        // if not enough money given, all is returned and nothing else happens                
        else
            return cashGiven;
    }

    
    public double payGourmet(double cashGiven) 
    {
        // price of the gourmet lunch is 4.00 euros
        // if the given cash is at least the price of the lunch:
        if (cashGiven >= 4.00)
        {
            // the price of lunch is added to register
            this.cashInRegister += 4.00;
            // the amount of sold lunch is incremented by one
            this.gourmetSold++;
            // method returns cashGiven - lunch price 
            return cashGiven - 4.00;
        }
        
        // if not enough money given, all is returned and nothing else happens                
        else
            return cashGiven;
    }


    public String toString() 
    {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
    
    
    public boolean payEconomical(LyyraCard card)
    {
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= 2.50)
        {
            card.pay(2.50);
            // the amount of sold lunch is incremented by one
            this.economicalSold++;
            // the method returns true
            return true;
        }
        
        // if not enough money given, method returns false                
        else
            return false;
    }
    
    
    public boolean payGourmet(LyyraCard card)
    {
        // if the balance of the card is at least the price of the lunch:
        if (card.balance() >= 4.00)
        {
            card.pay(4.00);
            // the amount of sold lunch is incremented by one
            this.gourmetSold++;
            // the method returns true
            return true;
        }
        
        // if not enough money given, method returns false                
        else
            return false;
    }
    
    
    public void loadMoneyToCard(LyyraCard card, double sum)
    {
        if (sum > 0)
        {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }
}