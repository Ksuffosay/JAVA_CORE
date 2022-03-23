package Lesson_4;

import java.util.*;


public class HomeWork_4 {

    public static void main(String[] args) {
        words();
        directory();


    }
    private static void words() {
        Map<String, Integer> hm = new HashMap<>();
        String[] words = {
                "Ручка", "Тетрадка", "Учебник",
                "Карандаш", "Пинал", "Линейка",
                "Учебник", "Циркуль", "Ластик",
                "Маркеры", "Линейка", "Стикеры",
        };

        for (int i = 0; i < words.length; i++) {
            if (hm.containsKey(words[i]))
                hm.put(words[i], hm.get(words[i]) + 1);
            else
                hm.put(words[i], 1);
        }
        System.out.println("Массив с набором слов: " + hm);
    }
    private static void directory() {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Иванов", "89110072233");
        phonebook.add("Петрова", "89110082233");
        phonebook.add("Сидоров", "89110092233");
        phonebook.add("Костин", "89110102233");
        phonebook.add("Иванов", "89110112233");
        phonebook.add("Сорока", "89110122233");

        System.out.println("Номера телефонов по фамилии: ");
        System.out.println(phonebook.get("Иванов"));
        System.out.println(phonebook.get("Костин"));
        System.out.println(phonebook.get("Петрова"));

    }
}
