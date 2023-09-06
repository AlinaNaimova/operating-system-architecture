package shapes;

import java.util.ArrayList;
import java.util.List;

public class GeometryFigure {
    public List<FigureInfo> toolbox;

    public GeometryFigure() {
        toolbox = new ArrayList<>();
    }

    // Метод для добаления новой фигуры
    public void add(String name, IShape shape) {
        toolbox.add(new FigureInfo(name, shape));
    }

    // Метод для удаления фигуры
    public void remove(int index) {
        toolbox.remove(index);
    }

    // Метод для поиска фигур по названию
    public int search(String name) {
        for (int i = 0; i < toolbox.size(); i++) {
            if (toolbox.get(i).getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    // Метод для форматирования чисел с двумя знаками после запятой
    public static String formatDouble(double number) {
        return String.format("%.2f", number);
    }

    // Метод отображения подробной информации о фигурк
    public void getInfo(int index) {
        FigureInfo figure = toolbox.get(index);
        System.out.println("Название фигуры: " + figure.getName());
        System.out.println("Площадь: " + formatDouble(figure.getShape().getArea()));
        System.out.println("Периметр: " + formatDouble(figure.getShape().getPerimeter()));
    }
}