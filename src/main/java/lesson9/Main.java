package lesson9;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();
        int number;
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {
            number = rnd.nextInt() % 100;
            intList.add(number);
        }
        System.out.println(intList);
        List<Integer> evenList = intList.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);


        List<String> list = new ArrayList<>(List.of("Highload", "High", "Load", "Highload"));
        long count = list.stream().filter(n -> n.contains("High")).count();
        System.out.println("High встречается в строке " + count + " раз");

        String firstElement = list.stream().findFirst().orElse("0");
        System.out.println("Первый элемент " + firstElement);

        String lastElement = list.stream().reduce((a, b) -> b).orElse("0");
        System.out.println("Последний элемент " + lastElement);

        ArrayList<String> listString = new ArrayList<>();
        listString.add("f10");
        listString.add("f15");
        listString.add("f2");
        listString.add("f4");
        listString.add("f4");
        String[] arr = listString.stream().
                sorted(Comparator.comparingInt(s -> Integer.parseInt(s.substring(1)))).toArray(String[]::new);
        System.out.println(Arrays.toString(arr));

        List<String> newList = new ArrayList<>();
        System.out.println("Введите значение");
        Scanner scan = new Scanner(System.in);
        String a;
        while (true) {
            a = scan.nextLine();
            if (a.isEmpty()) break;
            newList.add(a);
        }
        List<String> filterList = newList.stream().filter(n -> n.startsWith("f")).collect(Collectors.toList());
        System.out.println(filterList);
    }
}
