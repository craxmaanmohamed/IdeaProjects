package Assingment03;

public class TestColorable {
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Square(6);
        objects[1] = new Square(9.6);
        objects[2] = new Square(20);
        objects[3] = new Square(2);
        objects[4] = new Square(5);

        for (GeometricObject object : objects) {
            System.out.println("Area: " + object.getArea());
            if (object instanceof Colorable) {
                ((Colorable) object).howToColor();
            }
        }
    }



}
