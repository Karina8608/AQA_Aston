package Lesson_3;

public class Figures {
    public static void main(String[] args) {
        Circle circle = new Circle(5, "Blue", "Black");
        Rectangle rectangle = new Rectangle(4, 6, "Green", "Red");
        Triangle triangle = new Triangle(3, 4, 5, "Yellow", "Purple");

        printShapeInfo(circle);
        printShapeInfo(rectangle);
        printShapeInfo(triangle);
    }

    static void printShapeInfo(Shape shape) {
        System.out.println("Фигура:" + shape.getName());
        System.out.println("Периметр: " + shape.getPerimeter());
        System.out.println("Площадь: " + shape.getArea());
        System.out.println("Цвет фона: " + shape.getFillColor());
        System.out.println("Цвет границ: " + shape.getBorderColor());
        System.out.println();
    }
}
