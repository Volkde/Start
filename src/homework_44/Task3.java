package homework_44;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

        List<Integer> transformedList = numbers.stream()
                .filter(i -> i % 2 == 0)
                .map(i -> i * 2)
                .collect(Collectors.toList());

        System.out.println("Новый список: " + transformedList);
    }
}
