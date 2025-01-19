package lesson5.task2;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(3);
        circle.fillColor("Blue");
        circle.borderColor("Red");
        circle.printInfo();

        Rectangle rectangle = new Rectangle(2, 3);
        rectangle.fillColor("Black");
        rectangle.borderColor("White");
        rectangle.printInfo();

        Triangle triangle = new Triangle(2, 7, 6);
        triangle.fillColor("Brown");
        triangle.borderColor("Green");
        triangle.printInfo();
    }
}
