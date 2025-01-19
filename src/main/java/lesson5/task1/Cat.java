package lesson5.task1;

public class Cat extends Animal {

    public String name;
    public int appetite;
    public boolean fullness;

    public Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    public void eat(Plate p) {
        p.decreaseFood(appetite);
    }

    @Override
    public void run(int a) {
        if (a > 200) System.out.println("Кот столько не бежит");
        else System.out.println("Мурзик пробежал " + a + " м");
    }

    @Override
    public void swim(int a) {
        System.out.println("Кот не умеет плавать");
    }
}
