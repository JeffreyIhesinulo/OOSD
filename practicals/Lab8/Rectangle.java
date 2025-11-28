public class Rectangle extends TwoDShape{
    private double length;
    private double width;
    private double area;
    public Rectangle(String name, String colour, double length, double width){
        super(name, colour);
        this.length = length;
        this.width = width;
    }
    public void setLength(double length){
        this.length = length;
    }
    public void setWidth(double width){
        this.width = width;
    }

    @Override
    public double area() {
        area = length*width;
        return area;
    }

    @Override
    public String toString() {
        return (super.toString()+"\nLength = " + this.length + "\nWidth = " + this.width);
    }
}
