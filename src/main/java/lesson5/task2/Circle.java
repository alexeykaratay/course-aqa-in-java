package lesson5.task2;

public class Circle implements Figure, Fillable, Borderable {

    private double radius;
    private String fillColor;
    private String borderColor;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void borderColor(String color) {
        this.borderColor = color;

    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void fillColor(String color) {
        this.fillColor = color;
    }

    public void printInfo() {
        System.out.println("Круг");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заполнения: " + fillColor);
        System.out.println("Цвет рамки: " + borderColor);
    }
}
