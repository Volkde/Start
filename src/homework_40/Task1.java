package homework_40;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        String testString = "Тестовая строка для удаления слов, которые повторяются и строка для удаления ";
        System.out.println(getUniqueSortedWords(testString));
    }

    public static List<String> getUniqueSortedWords(String input) {

        String cleanedString = input.replaceAll("[^a-zA-Z0-9а-яА-Я ]", "");

        String[] wordsArray = cleanedString.split(" ");

        Set<String> uniqueWords = new HashSet<>(Arrays.asList(wordsArray));

        List<String> sortedWords = new ArrayList<>(uniqueWords);

        sortedWords.sort(Comparator.comparingInt(String::length).thenComparing(Comparator.naturalOrder()));

        return sortedWords;
    }


}
