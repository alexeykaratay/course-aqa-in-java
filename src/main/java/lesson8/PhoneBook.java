package lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {

    private Map<String, List<Integer>> phoneBooks;

    PhoneBook() {
        phoneBooks = new HashMap<>();
    }

    public void add(String name, Integer number) {
        phoneBooks.computeIfAbsent(name, k -> new ArrayList<>()).add(number);
    }

    public void get(String name) {
        if (phoneBooks.containsKey(name)) {
            List<Integer> numbers = phoneBooks.get(name);
            System.out.println(name + " : " + numbers);
        } else {
            System.out.println("Пользователя нет в справочнике");
        }
    }
}
