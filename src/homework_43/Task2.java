package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {

    public static void main(String[] args) {

        List<String> strings = List.of("Apple", "Banana", "Avocado", "Apricot", "Orange", "Avocado", "Almond");
        List<String> filteredStrings = filterAndSortStrings(strings, "A");

        System.out.println("Исходный список: " + strings);
        System.out.println("Отфильтрованный и отсортированный список : " + filteredStrings);
    }

    public static List<String> filterAndSortStrings(List<String> strings, String startLetter) {

        return strings.stream()
                .filter(str -> str.startsWith(startLetter))
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }


}
