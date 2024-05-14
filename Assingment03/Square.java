package Assingment03;

public class Square extends GeometricObject implements Colorable {
    private double side;


    public Square() {
        this.side = 0;
    }


    public Square(double side) {
        this.side = side;
    }


    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;


    }
    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public void howToColor() {
        System.out.println("all sides.");
    }

}