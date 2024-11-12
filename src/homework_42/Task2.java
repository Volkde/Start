package homework_42;

import java.util.HashMap;
import java.util.Map;


public class Task2 {

    public static void main(String[] args) {

        String text = "Строка для подсчета слов по длине и вывода результата ";

        Map<Integer, Integer> wordLengths = countWordLengths(text);

        for (Map.Entry<Integer, Integer> entry : wordLengths.entrySet()) {
            System.out.println("Длина слова : " + entry.getKey() + ", количество слов: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> countWordLengths(String text) {

        Map<Integer, Integer> lengthCountMap = new HashMap<>();


        text = text.replaceAll("[^a-zA-Zа-яА-Я ]", "").toLowerCase();
        String[] words = text.split("\\s+");

        for (String word : words) {

            if (!word.isEmpty()) {
                int length = word.length();
                lengthCountMap.put(length, lengthCountMap.getOrDefault(length, 0) + 1);
            }
        }

        return lengthCountMap;
    }
}