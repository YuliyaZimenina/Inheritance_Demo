//TwoDimensionShape subclass to represent rectangles.
public class Rectangle extends TwoDimensionShape {
    Rectangle(double w, double h) {
        super(w, h);
    }

    boolean isSquare() {
        if (getWidth() == getWidth()) return true;
        return false;
    }

    double area() {
        return getWidth() * getHeight();
    }
}
