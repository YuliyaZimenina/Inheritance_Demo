// Class for representing two-dimensional objects
public class TwoDimensionShape {
    private double width;
    private double height;

    // Adding a standard constructor
    TwoDimensionShape() {
        width = height = 0.0;
    }

    //Adding a parameterized constructor.
    TwoDimensionShape(double w, double h) {
        width = w;
        height = h;
    }

    // Adding a constructor of an object with the same width and height
    TwoDimensionShape(double x) {
        width = height = x;
    }

    //Add access methods
    double getWidth() {
        return width;
    }

    double getHeight() {
        return height;
    }

    void setWidth(double w) {
        width = w;
    }

    void setHeight(double h) {
        height = h;
    }

    void showDim() {
        System.out.println("Width and height of the shape: " + width + " & "
                + height);
    }
}