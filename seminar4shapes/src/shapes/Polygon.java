package shapes;

public class Polygon implements IShape {
    private double[] xCoords;
    private double[] yCoords;

    public Polygon(double[] xCoords, double[] yCoords) {
        this.xCoords = xCoords;
        this.yCoords = yCoords;
    }

    /**
     * Для расчета площади и периметра многоугольника в классе Polygon используем формулу Гаусса
     * для расчета площади многоугольника и формулу длины ломаной линии для расчета периметра.
     */

    @Override
    public double getArea() {
        double area = 0;
        int j = xCoords.length - 1;
        for (int i = 0; i < xCoords.length; i++) {
            area += (xCoords[j] + xCoords[i]) * (yCoords[j] - yCoords[i]);
            j = i;
        }
        return Math.abs(area / 2);
    }

    @Override
    public double getPerimeter() {
        double perimeter = 0;
        int j = xCoords.length - 1;
        for (int i = 0; i < xCoords.length; i++) {
            perimeter += Math.sqrt(Math.pow(xCoords[j] - xCoords[i], 2) + Math.pow(yCoords[j] - yCoords[i], 2));
            j = i;
        }
        return perimeter;
    }
}