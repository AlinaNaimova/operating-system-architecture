package shapes;

// Дополнительный класс для хранения информации о фигуре
public class FigureInfo {
    private String name;
    private IShape shape;

    public FigureInfo(String name, IShape shape) {
        this.name = name;
        this.shape = shape;
    }

    public String getName() {
        return name;
    }

    public IShape getShape() {
        return shape;
    }
}

