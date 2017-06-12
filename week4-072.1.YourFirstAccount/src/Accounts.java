
public class Accounts 
{

    public static void main(String[] args) 
    {
        Account newAccount = new Account("New account", 100.0);
        newAccount.deposit(20.0);
        System.out.println(newAccount); 
    }
}
