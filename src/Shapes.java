public class Shapes {
    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle();
        Triangle secondTriangle = new Triangle("Contour", 8.0, 12.0);
        Triangle thirdTriangle = new Triangle(4.0);
        Rectangle firstRectangle = new Rectangle(5.0, 5.0);
        Rectangle secondRectangle = new Rectangle(7.0, 4.0);

        System.out.println("*** TRIANGLES ***");
       /*
       Triangle-type objects are available to all members
       of the Triangle class, including those inherited
       from TwoDimensionalShape class
        */
        System.out.println("Object information firstTriangle: ");
        firstTriangle.showStyle();
        firstTriangle.showDim();
        System.out.println("Area: " + firstTriangle.area());
        System.out.println("Object information secondTriangle: ");
        secondTriangle.showStyle();
        secondTriangle.showDim();
        System.out.println("Area: " + secondTriangle.area());
        System.out.println("Object information thirdTriangle: ");
        thirdTriangle.showStyle();
        thirdTriangle.showDim();
        System.out.println("Area: " + thirdTriangle.area());


        System.out.println("*** RECTANGLES ***");
        System.out.println("Object information firstRectangle: ");
        firstRectangle.showDim();
        System.out.println("Square or not?: " + firstRectangle.isSquare());
        System.out.println("Area: " + firstRectangle.area());
        System.out.println("Object information secondRectangle: ");
        secondRectangle.showDim();
        System.out.println("Square or not?: " + secondRectangle.isSquare());
        System.out.println("Area: " + secondRectangle.area());
    }
}
