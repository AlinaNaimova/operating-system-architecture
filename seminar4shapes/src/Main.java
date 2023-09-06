import shapes.*;

public class Main {
    public static void main(String[] args) {
        // Создаем объект класса GeometryFigure
        GeometryFigure figure = new GeometryFigure();
        // Добавляем фигуры в список
        figure.add("Круг", new Circle(5));
        figure.add("Прямоугольник", new Rectangle(3, 4));
        figure.add("Треугольник", new Triangle(3, 4, 5));
        figure.add("Квадрат", new Quadrilateral(4));
        figure.add("Многоугольник", new Polygon(new double[]{0, 2, 4, 3}, new double[]{0, 1, 3, 4}));

        // Ищем фигуру по названию и выводим информацию о ней
        int index = figure.search("Круг");
        if (index != -1) {
            System.out.println("Информация о фигуре:");
            figure.getInfo(index);
        } else {
            System.out.println("Фигура не найдена");
        }

        // Удаляем фигуру из списка
       figure.remove(3);

        // Выводим информацию о всех фигурах в списке
        for (int i = 0; i < figure.toolbox.size(); i++) {
            System.out.println("Информация о фигуре " + (i+1) + ":");
            figure.getInfo(i);
            System.out.println();
        }
    }

}


