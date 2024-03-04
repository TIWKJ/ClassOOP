public class Testbox {
    public static void main(String[] args) {
        Box box1 = new Box();
        box1.setDimension(2,2,2);
        System.out.println(box1.area());
        System.out.println(box1.toString());
    }
}
