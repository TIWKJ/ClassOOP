public class Sphere extends ThreeDimensionalShape{
    public String toString() {
        return "Sphere" + super.toString();
    }    
    public static void main(String[] args) {
        Sphere s = new Sphere();
        System.out.println(s.toString());
    }
}
