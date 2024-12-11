//TwoDimensionShape subclass to represent rectangles.
public class Rectangle extends TwoDimensionShape {
    boolean isSquare() {
        if (getWidth() == getWidth()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
