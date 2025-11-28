public class Cylinder extends ThreeDShape {
    private double radius;
    private double height;
    private double area;
    private double volume;
    public Cylinder(String name, String colour, double radius, double height)
    {
        super(name, colour);
        this.radius = radius;
        this.height = height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        area = 2*3.14*radius*radius + 2*3.14*radius*height;
        return area;
    }

    @Override
    public double volume() {
        volume = 3.14*radius*radius*height;
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRadius = " + this.radius+"\nHeight="+this.height;
    }
}
