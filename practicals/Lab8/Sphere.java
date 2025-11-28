public class Sphere extends ThreeDShape{
    private double radius;
    private double area;
    private double volume;
    public Sphere(String name, String colour, double radius){
        super(name, colour);
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        area = 4*3.14*radius*radius;
        return area;
    }

    @Override
    public double volume() {
        volume = (double) 4 /3*3.14*radius*radius*radius;
        return volume;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRadius = " + this.radius;
    }
}
