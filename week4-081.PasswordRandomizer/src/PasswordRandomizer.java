import java.util.Random;

public class PasswordRandomizer 
{
    private int length;
    private Random random;
            
    public PasswordRandomizer(int length) 
    {
        this.length = length;
        random = new Random();
    }

    public String createPassword() 
    {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String password = "";
        int pwLength = 0;
        
        while (pwLength < this.length)
        {
            password += alphabet.charAt(random.nextInt(26));;
            pwLength++;
        }

        return password;
    }
}
