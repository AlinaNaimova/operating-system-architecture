package shapes;

public class Quadrilateral implements IShape {
    private double side;
//    private double side2;
//    private double side3;
//    private double side4;


    public Quadrilateral(double side) {
        this.side = side;
//        this.side2 = side2;
//        this.side3 = side3;
//        this.side4 = side4;
    }

    @Override
    public double getArea() {
        return side * side * side * side;
    }

    @Override
    public double getPerimeter() {
        return side * 4;
    }
}
