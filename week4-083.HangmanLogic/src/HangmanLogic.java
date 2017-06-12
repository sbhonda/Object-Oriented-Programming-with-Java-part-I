
public class HangmanLogic 
{

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) 
    {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() 
    {
        return this.numberOfFaults;
    }

    public String guessedLetters() 
    {
        return this.guessedLetters;
    }

    public int losingFaultAmount() 
    {
        return 12;
    }

    public void guessLetter(String letter) 
    {
        // if the letter has already been guessed, nothing happens
        if (guessedLetters.contains(letter))
            return;
           
        //the letter is added among the already guessed letters
        this.guessedLetters += letter;                
                
        if (!this.word.contains(letter))
            // if the word does not contains the guessed letter, number of faults increase
            this.numberOfFaults++;       
    }

    public String hiddenWord() 
    {
        // program here the functionality for building the hidden word

        String hiddenWord = "";
        String currentChar = "";
        int charCounter = 0;
        
        // iterate through this.word letter by letter
        while (charCounter < this.word.length())
        {
            currentChar = "" + this.word.charAt(charCounter);

            if (this.guessedLetters.contains(currentChar))
            {
                // if the letter in turn is within the guessed words, put it in to the hidden word
                hiddenWord += currentChar;
            }
            
            else
            {
                // if the letter is not among guessed, replace it with _ in the hidden word 
                hiddenWord += "_";
            }
            
            charCounter++;
        }
              
        // return the hidden word at the end
        return hiddenWord;
    }
}
