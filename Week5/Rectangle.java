public class Rectangle {
    private int width;
    private int height;

	
    public Rectangle() {
        this.width = 0;
        this.height = 0;
    }

    public Rectangle(int w, int h) {
        this.width = w;
        this.height = h;
    }

    public int area() {
        return width * height;
    }

    public int perimeter() {
        return 2 * (width + height);
    }


    // Getter
    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
