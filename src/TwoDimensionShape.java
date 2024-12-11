// Class for representing two-dimensional objects
public class TwoDimensionShape {
    private double width;
    private double height;

    //Add access methods
    double getWidth(){
        return width;
    }
    double getHeight(){
        return height;
    }
    void setWidth(double w){
        width = w;
    }

    void setHeight(double h){
        height = h;
    }


    void showDim() {
        System.out.println("Width and height of the shape: " + width + " & "
                + height);
    }
}