package lesson5.task1;

public class Dog extends Animal {

    @Override
    public void run(int a) {
        if (a > 500) System.out.println("Бобик столько не бежит");
        else System.out.println("Бобик пробежал " + a + " м");
    }

    @Override
    public void swim(int a) {
        if (a > 10) System.out.println("Бобик столько не плывет");
        else System.out.println("Бобик проплыл " + a + " м");
    }
}
