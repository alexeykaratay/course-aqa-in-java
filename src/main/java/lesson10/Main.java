package lesson10;

public class Main {

    public static void main(String[] args) {
        Box<Apple> box1 = new Box<>();
        box1.add(new Apple());
        box1.add(new Apple());
        box1.add(new Apple());

        Box<Orange> box2 = new Box<>();
        box2.add(new Orange());
        box2.add(new Orange());

        System.out.println(box1.getWeight());
        System.out.println(box2.getWeight());
        System.out.println(box1.compare(box2));

        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());

        box1.pourTo(box3);
        System.out.println(box1.getWeight());
        System.out.println(box3.getWeight());
    }
}
