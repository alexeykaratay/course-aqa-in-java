package lesson5.task2;

public class Triangle implements Fillable, Figure, Borderable {

    private double side1;
    private double side2;
    private double side3;
    private String fillColor;
    private String borderColor;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    @Override
    public void borderColor(String color) {
        this.borderColor = color;

    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public double area() {

        return Math.sqrt((perimeter() / 2) *
                ((perimeter() / 2) - side1) * ((perimeter() / 2) - side2) * ((perimeter() / 2) - side3));
    }

    @Override
    public void fillColor(String color) {
        this.fillColor = color;
    }

    public void printInfo() {
        System.out.println("Треугольник");
        System.out.println("Периметр: " + perimeter());
        System.out.println("Площадь: " + area());
        System.out.println("Цвет заполнения: " + fillColor);
        System.out.println("Цвет рамки: " + borderColor);
    }
}
