//TwoDimensionShape subclass to represent rectangles.
public class Rectangle extends TwoDimensionShape {
    boolean isSquare() {
        if (width == height) return true;
        return false;
    }

    double area() {
        return width * height;
    }
}
