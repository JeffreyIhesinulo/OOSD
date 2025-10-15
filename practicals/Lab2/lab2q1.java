public class lab2q1 {
    public static void main(String[] args) {
        HotelRoom roomA = new HotelRoom();
        //roomA.setStatus(1);
        roomA.setRate(100);
        roomA.roomNumberSet(200);
        roomA.roomTypeSet("Single");
        System.out.println("Number and type of the roomA is " + roomA.getNumber()+" " + roomA.getType()+" The night rate is "+roomA.getRate());
        //if(roomA.getStatus()==1)
       // {
         //   System.out.println("The room is occupied");
        //}
        //else if(roomA.getStatus()==0)
       // {
           // System.out.println("The room is vaccant");
        //}
        //else
        //{
          //  System.out.println("Error");
        //}
        HotelRoom roomB = new HotelRoom();
        //roomB.setStatus(0);
        roomB.setRate(80);
        roomB.roomNumberSet(201);
        roomB.roomTypeSet("Double");
        System.out.println("Number and type of the roomB is " + roomB.getNumber()+" " + roomB.getType()+" The night rate is "+roomB.getRate());
        roomB.setOccupied();
        System.out.println(roomB.isOccupied());
        roomB.setOccupied();

         /*if(roomB.getStatus()==1)
        {
            System.out.println("The room is occupied");
        }
        else if(roomB.getStatus()==0)
        {
            System.out.println("The room is vaccant");
        }
        else
        {
            System.out.println("Error");
        } */
        //HotelRoom roomC = new HotelRoom(202, "Single", 0, 90);
        //System.out.println("Number and type of the roomC is " + roomC.getNumber()+" " + roomC.getType()+" The night rate is "+roomC.getRate());
        /*  if(roomC.getStatus()==1)
        {
            System.out.println("The room is occupied");
        }
        else if(roomC.getStatus()==0)
        {
            System.out.println("The room is vaccant");
        }
        else
        {
            System.out.println("Error");
        }
        if (roomB.isOccupied()=false) 
        {
            
        } */
        


    }
}
