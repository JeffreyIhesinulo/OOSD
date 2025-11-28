public class Circle extends TwoDShape{
        private double radius;
        private double area;
      public Circle(String name, String colour,  double radius){
          super(name, colour);
          this.radius = radius;
      }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
          area = 3.14*radius*radius;
        return area;
    }

    @Override
    public String toString() {
        return super.toString()+"\nRadius = " + this.radius;
    }
}
