public class Shapes {
    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle();
        Triangle secondTriangle = new Triangle();
       /*
       Triangle-type objects are available to all members
       of the Triangle class, including those inherited
       from TwoDimensionalShape class
        */
        firstTriangle.width = 4.0;
        firstTriangle.height = 4.0;
        firstTriangle.style = "Painted";
        secondTriangle.width = 8.0;
        secondTriangle.height = 12;
        secondTriangle.style = "Contour";
        System.out.println("Object information firstTriangle: ");
        firstTriangle.showStyle();
        firstTriangle.showDim();
        System.out.println("Area: " + firstTriangle.area());
        System.out.println("Object information secondTriangle: ");
        secondTriangle.showStyle();
        secondTriangle.showDim();
        System.out.println("Area: " + secondTriangle.area());
    }
}
