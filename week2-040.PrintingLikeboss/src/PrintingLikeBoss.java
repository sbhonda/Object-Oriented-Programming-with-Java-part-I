public class PrintingLikeBoss 
{

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) 
    {
        int starCounter = 0;
        
        while (starCounter < amount)
        {
            System.out.print("*");
            starCounter++;
        }
        System.out.println("");
    }

    public static void printWhitespaces(int amount) 
    {
        int spaceCounter = 0;
        
        while (spaceCounter < amount)
        {
            System.out.print(" ");
            spaceCounter++;
        }
    }

    public static void printTriangle(int size) 
    {
        int rowCounter = 0;
        int spaceCounter = size - 1;
        int starCounter = size - (size - 1);
        
        while (rowCounter < size)
        {
            printWhitespaces(spaceCounter);
            spaceCounter--;
            printStars(starCounter);
            starCounter++;
            rowCounter++;
        }
    }

    public static void xmasTree(int height) 
    {
        int rowCounter = 0;
        int spaceCounter = height - 1;
        int starCounter = 1;
        
        while (rowCounter < height)
        {
            printWhitespaces(spaceCounter);
            spaceCounter--;
            printStars(starCounter);
            starCounter++;
            starCounter++;
            rowCounter++;
        }
       
        int trunkSpace =((height*2)-3)/2;
        printWhitespaces(trunkSpace);
        printStars(3);
        printWhitespaces(trunkSpace);
        printStars(3);
    }

    public static void main(String[] args) 
    {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
