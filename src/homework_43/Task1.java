package homework_43;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(5, 12, 30, 8, 75, 102, 50, 11, 99);
        List<Integer> filteredNumbers = filterNumbers(numbers);

        System.out.println("Исходный список: " + numbers);
        System.out.println("Отфильтрованный список чисел: " + filteredNumbers);
    }

    public static List<Integer> filterNumbers(List<Integer> numbers) {

        return numbers.stream()
                .filter(num -> num % 2 == 0)
                .filter(num -> num > 10 && num < 100)
                .collect(Collectors.toList());
    }


}
