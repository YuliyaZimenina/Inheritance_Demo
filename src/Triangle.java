//TwoDimensionShape subclass to represent triangles.
public class Triangle extends TwoDimensionShape{
    private String style;

    // Add a constructor
    Triangle (String s, double w, double h){
        /*
        Initialization of part of the object inherited
        from the class TwoDimensionShape
         */
        setWidth(w);
        setHeight(h);
        style = s;
    }
    double area(){
        /*
        From the Triangle class, you can refer to the members
        of TwoDimensionShape class, as if they were declared in
        the Triangle class.
         */
        return getWidth() * getHeight() / 2;
    }

    void showStyle(){
        System.out.println("Triangle style: " + style);
    }
}
