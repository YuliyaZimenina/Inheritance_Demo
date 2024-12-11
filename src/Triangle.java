//TwoDimensionShape subclass to represent triangles.
public class Triangle extends TwoDimensionShape{
    String style;

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
