public class lab2bq1 {

    public static void main(String[] args)  
    {
        Ractangle Huinya = new Ractangle();
        Huinya.setLenght(4);
        Huinya.setWidth(10);
        //System.out.println(Huinya.getLenght() + " is lenght and " + Huinya.getWidth() + " is width");
        System.out.println("The area of the ractangle is "+ Huinya.getArea());
        System.out.println("The perimeter of the ractangle is "+ Huinya.getPer());
        System.out.println(Huinya.toString());
        Huinya.printRectangle();
    }



}