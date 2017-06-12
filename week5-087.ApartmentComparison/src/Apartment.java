

public class Apartment 
{
    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;
    private int cost;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) 
    {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
        this.cost = squareMeters * pricePerSquareMeter;
    }
    
    
    public boolean larger(Apartment otherApartment)
    {
        if (this.squareMeters > otherApartment.squareMeters)
            return true;
        else
            return false;            
    }
    
    
    public int priceDifference(Apartment otherApartment)
    {
        return Math.abs(this.cost - otherApartment.cost);    
    }
    
    
    public boolean moreExpensiveThan(Apartment otherApartment)
    {
        if (this.cost > otherApartment.cost)
            return true;
        else
            return false;
    }
}
