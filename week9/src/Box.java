public class Box extends Rectangle{
    private double height;
    
    Box() {
        height = 0;
    }

    Box(double l, double w, double h) {
        super(l,w);
        height = h;
    }

    public void setDimension(double l, double w, double h) {
        super.setDimension(l,w);
        height = h;
    }
    public double getHeight(){
        return height;
    }
    public double volume() {
        return super.area() * this.height;

    }
    public String toString() {
        return super.toString() + ";" + "height = " + this.height;
    }

    public double area() {
        return super.area() * 6;
    }

}