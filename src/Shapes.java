public class Shapes {
    public static void main(String[] args) {
        Triangle firstTriangle = new Triangle("Painted", 4.0, 4.0);
        Triangle secondTriangle = new Triangle("Contour", 8.0, 12.0);
        Rectangle firstRectangle = new Rectangle();
        Rectangle secondRectangle = new Rectangle();

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

        System.out.println("*** RECTANGLES ***");
        firstRectangle.setWidth(5.0);
        firstRectangle.setHeight(5.0);
        System.out.println("Object information firstRectangle: ");
        firstRectangle.showDim();
        System.out.println("Square or not?: " + firstRectangle.isSquare());
        System.out.println("Area: " + firstRectangle.area());
        secondRectangle.setWidth(7.0);
        secondRectangle.setHeight(4.0);
        System.out.println("Object information secondRectangle: ");
        secondRectangle.showDim();
        System.out.println("Square or not?: " + secondRectangle.isSquare());
        System.out.println("Area: " + secondRectangle.area());
    }
}
