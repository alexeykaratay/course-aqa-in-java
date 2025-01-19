package lesson8;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String arr[] = {"One", "Two", "One", "Three", "Two", "Five", "One", "Five", "Three", "One"};
        Set<String> numbers = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            numbers.add(arr[i]);
        }
        System.out.println("Список уникальных слов " + numbers);

        HashMap<String, Integer> wordsCount = new HashMap<>();
        for (String word : arr) {
            if (wordsCount.containsKey(word)) {
                wordsCount.put(word, wordsCount.get(word) + 1);
            } else {
                wordsCount.put(word, 1);
            }
        }
        System.out.println("Количество вхождений: ");
        for (String word : wordsCount.keySet()) {
            System.out.println(word + "-" + wordsCount.get(word));
        }

        System.out.println();
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Petrov", 912);
        phoneBook.add("Petrov", 111);
        phoneBook.add("Ivanov", 123);

        phoneBook.get("Petrov");
        phoneBook.get("Ivanov");
    }
}
