public class GeometricObj {
    private String color;

    GeometricObj(){

    }

    GeometricObj(String color){
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void print() {
        System.out.println("Color = " + color);
    }

    
}