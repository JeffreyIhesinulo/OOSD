public class Triangle extends TwoDShape {
    private double base;
    private double height;
    private double area;
    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        area = 0.5 * base * height;
        return area;
    }


    @Override
    public String toString() {
        return super.toString()+"\nBase = " + this.base + "\nHeight = " + this.height;
    }
}
