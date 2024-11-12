package homework_42;

import java.util.HashMap;
import java.util.Map;


public class Task1 {

    public static void main(String[] args) {

        String str1 = "Listen";
        String str2 = "Silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("Строки являются анаграммой");
        } else {
            System.out.println("Строки не являются анаграммой");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {

        str1 = str1.replaceAll("\\s+", "").toLowerCase();
        str2 = str2.replaceAll("\\s+", "").toLowerCase();

        if (str1.length() != str2.length()) {
            return false;
        }


        Map<Character, Integer> charCount1 = createCharCountMap(str1);
        Map<Character, Integer> charCount2 = createCharCountMap(str2);


        return charCount1.equals(charCount2);
    }

    private static Map<Character, Integer> createCharCountMap(String str) {

        Map<Character, Integer> charCountMap = new HashMap<>();

        for (char ch : str.toCharArray()) {

            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }

        return charCountMap;
    }
}