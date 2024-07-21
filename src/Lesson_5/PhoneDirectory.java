package Lesson_5;

import java.util.*;

class PhoneDirectory {
    private final Map<String, List<String>> phoneBook;

    public PhoneDirectory() {
        phoneBook = new HashMap<>();
    }

    // Метод для добавления записи
    public void add(String lastName, String phoneNumber) {
        phoneBook.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Метод для поиска номера телефона по фамилии
    public List<String> get(String lastName) {
        return phoneBook.getOrDefault(lastName, Collections.emptyList());
    }

    public static void main(String[] args) {
        PhoneDirectory directory = new PhoneDirectory();

        // Пример добавления записей
        directory.add("Иванов", "+123456789");
        directory.add("Петров", "+987654321");
        directory.add("Иванов", "+111222333");
        directory.add("Мартынов", "+192233333");


        String searchLastName = "Иванов";
        List<String> phones = directory.get(searchLastName);
        if (!phones.isEmpty()) {
            System.out.println("Номера телефонов для фамилии " + searchLastName + ":");
            for (String phone : phones) {
                System.out.println(phone);
            }
        } else {
            System.out.println("Нет записей для фамилии " + searchLastName);
        }
    }
}

