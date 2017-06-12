
import java.util.ArrayList;

/**
 *
 * @author shelley
 */
public class Library
{
    private ArrayList<Book> Books;
    
    public Library()
    {
        this.Books = new ArrayList<Book>();    
    }
    
    
    public void addBook(Book newBook) 
    {
        Books.add(newBook); 
    }
    
    
    public void printBooks()
    {
        for (Book currentBook : Books)
        {
            System.out.println(currentBook);
        }
    }
    
    
    public ArrayList<Book> searchByTitle(String title)
    {
        ArrayList Search = new ArrayList<Book>();
        
        for (Book currentBook : Books)
        {
            if (StringUtils.included(currentBook.title(), title))
                Search.add(currentBook);
        }
        return Search;
    }
    
            
    public ArrayList<Book> searchByPublisher(String publisher)
    {
        ArrayList Search = new ArrayList<Book>();
        
        for (Book currentBook : Books)
        {
            if (StringUtils.included(currentBook.publisher(), publisher))
                Search.add(currentBook);
        }
        return Search;
    }
    
    
    public ArrayList<Book> searchByYear(int year)    
    {
        ArrayList Search = new ArrayList<Book>();
        
        for (Book currentBook : Books)
        {
            if (currentBook.year() == year)
                Search.add(currentBook);
        }
        return Search;
    }               
}

