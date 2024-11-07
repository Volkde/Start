package homework_41;

import java.util.HashMap;
import java.util.Map;

public class Task123 {

    public static void main(String[] args) {
        String text = "Строка для проверки количества вхождений слов" +
                ".\n Строка для проверки и теста и количества слов для проверки";

        Map<String, Integer> wordFreq = wordCount(text);
        wordFreq.forEach((key, value) -> System.out.println(key + ": " + value));

        Map<Character, Integer> charFreq = charCount(text);

        System.out.println("\nВхождение символов ");
        charFreq.forEach((k, v) -> System.out.print("'" + k + "': " + v+ "; "));
        System.out.println();

        Map<String, Integer> map1 = new HashMap<>();

        map1.put("apple", 50);
        map1.put("banana", 20);
        map1.put("cherry", 30);

        Map<String, Integer> map2 = new HashMap<>();

        map2.put("banana", 25);
        map2.put("cherry", 30);
        map2.put("date", 40);

        Map<String, Integer> result = mapIntersect(map1, map2);
        result.forEach((key, value) -> System.out.println(key + ": " + value));
    }


    public static Map<String, Integer> wordCount(String text) {

        Map<String, Integer> map = new HashMap<>();

        String[] words = text.toLowerCase().split("\\W+");

        for (String word : words) {

            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        return map;
    }


    public static Map<Character, Integer> charCount(String text) {

        Map<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        return map;
    }


    public static Map<String, Integer> mapIntersect(Map<String, Integer> map1, Map<String, Integer> map2) {

        Map<String, Integer> result = new HashMap<>();

        for (String key : map1.keySet()) {

            if (map2.containsKey(key)) {

                result.put(key, map1.get(key));
            }

        }

        return result;
    }
}
