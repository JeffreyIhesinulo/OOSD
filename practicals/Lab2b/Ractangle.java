public class Ractangle 
{
    private double length;
    private double width;

    public Ractangle() 
    {
        length = 1;
        width = 1;
    }
    public Ractangle(double length1, double width1)
    {
        length = length1;
        width = width1;
    } 
    public void setWidth(double width1)
    {
        if (width1 > 0 && width1 <=40)
        {
            width = width1;
        }
        else
        {
            System.out.println("Incorrect input for width");
        }
    }
    public void setLenght(double length1)
    {
        if(length1 >0 &&length1 <=40)
        {
            length = length1;
        }
        else
        {
            System.out.println("Incorrect input for lenght");
        }
    }
    public double getWidth()
    {
        return width;
    }
    public double getLenght()
    {
        return length;
    }
    public double getArea()
    {
        double area;
        area = length*width;
        return area;
    }
    public double  getPer()
    {
        double per;
        per = (length+width)*2;
        return per;
    }
    public String toString() 
    {
        return "Rectangle[length=" + length + ", width=" + width + "]";
    }
    public void printRectangle() {
    for (int i = 0; i < (int) length; i++) //checks the row 
    { 
        for (int j = 0; j < (int) width; j++) //checks the colum
        {    
            if (i == 0 || i == (int) length - 1 || j == 0 || j == (int) width - 1) 
            {
                System.out.print("*");
            } 
            else
            {
                System.out.print(" ");
            }
        }
        System.out.println(); //next row
    }
}

    
    
}