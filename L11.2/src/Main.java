
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(15);
        circle.fillColor("Желтый");
        circle.borderColor("Красный");
        circle.info();

        Rectangle rectangle = new Rectangle(12,13);
        rectangle.fillColor("Черный ");
        rectangle.borderColor("Красный");
        rectangle.info();

        Triangle triangle = new Triangle(12,14,14);
        triangle.fillColor("Черный");
        triangle.borderColor("Синий");
        triangle.info();
    }
}