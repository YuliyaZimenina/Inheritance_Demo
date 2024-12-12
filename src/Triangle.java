//TwoDimensionShape subclass to represent triangles.
public class Triangle extends TwoDimensionShape{
    private String style;

    // Add a standard constructor
    Triangle(){
        super();
        style = "not present";
    }
    // Add a constructor
    Triangle (String s, double w, double h){
        // Calling a superclass constructor
        super(w, h);
        style = s;
    }
    //Add a constructor with one argument
    Triangle(double x){
        super(x);
        style = "painted";
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
