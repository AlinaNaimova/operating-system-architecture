package shapes;

public class Quadrilateral implements IShape {
    private double side;

    public Quadrilateral(double side) {
        this.side = side;
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
