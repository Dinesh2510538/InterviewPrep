package sep17;
class RectangleAttributes {
    double width;
    double height;

    public RectangleAttributes(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Rectangle {
    public static void main(String[] args) {
        RectangleAttributes rect = new RectangleAttributes(10.0, 5.0);
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
    }
}