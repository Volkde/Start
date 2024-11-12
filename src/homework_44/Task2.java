package homework_44;

import java.util.Comparator;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of("apple", "banana", "pear", "bretzel");

        String shortestString = strings.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("Нет дост. строк");

        System.out.println("Самая кроткая строка: " + shortestString);
    }
}
