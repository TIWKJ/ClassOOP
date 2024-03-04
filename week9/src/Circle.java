public class Circle extends GeometricObj {
    private double radius;

    Circle() {
        
    }

    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void print() {
        System.out.println("Area = " + getArea() + " : " + getColor() );
    }

    
}
