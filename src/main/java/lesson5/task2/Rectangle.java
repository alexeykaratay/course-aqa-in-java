package lesson5.task2;

public class Rectangle implements Figure, Fillable, Borderable{

    private double width;
    private double height;
    private String fillColor;
    private String borderColor;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void borderColor(String color) {
        this.borderColor = color;

    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void fillColor(String color) {
        this.fillColor = color;
    }

    public void printInfo() {
        System.out.println("Прямоугольник");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заполнения: " + fillColor);
        System.out.println("Цвет рамки: " + borderColor);
    }
}
