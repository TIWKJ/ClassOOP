public class TestTriangle {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Yellow", 3, 4, 5);
        System.out.println("Area:" + t1.getArea() +  " Perimeter: " + t1.getPerimeter() + " Color: " + t1.getColor());
    }
}
