
public class HotelRoom
{
    private int roomNumber;
    private String roomType;
    private double rate; //nightly rate
    private boolean occupied;

    public HotelRoom()
    {
        roomNumber = 0;
        roomType = "Unknown";
        rate = 0.0;
        occupied = false;
        
    }
    public HotelRoom(int num, String type, boolean occ, double r) 
    {
        roomNumber = num;
        roomType = type;
        occupied = occ;
        rate = r;
    } 
    public boolean isOccupied()
    {
        return occupied;
    }
    public void setRate(int rate1)
    {
        rate = rate1;
    }
    public void roomNumberSet(int num)
    {
        roomNumber = num;
    }
    public void roomTypeSet(String type)
    {
        roomType = type;
    }
    public int getNumber()
    {
        return roomNumber;
    }
    public String getType()
    {
        return roomType;
    }
    public double getRate()
    {
        return rate;
    }
    public void setOccupied()
    {
        if (occupied == false) 
        {
            occupied=true;
        }
        else
        {
            System.out.println(roomNumber+" The room is occupied");
        }
    }

}