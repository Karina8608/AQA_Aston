package Lesson_5;

import java.util.*;

public class WordArray {
    public static void main(String[] args) {
        String[] wordsArray = new String[] {
                "apple", "ball", "cat", "apple", "ball", "apple", "bird", "air", "book",
                "car", "city", "boy", "bird", "day", "east", "air", "country", "day"
        };

        Set<String> uniqueWords = new HashSet<>();
        Map<String, Integer> wordCount = new HashMap<>();

        for (String word : wordsArray) {
            uniqueWords.add(word);

            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        System.out.println("Уникальные слова:");
        for (String uniqueWord : uniqueWords) {
            System.out.println(uniqueWord);
        }

        System.out.println("\nКоличество повторений:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

