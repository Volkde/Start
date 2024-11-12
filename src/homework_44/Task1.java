package homework_44;

//Из списка целых чисел выделите те значения, которые больше 10;
// отсортируйте эти значения по значению последней цифры в числе
// и выведите результат на экране

//1. написать список
//2. сделать фильтр и сортировку


import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task1 {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(-1, 12, 0, 5, 1, 15, 24, 0, 18);

        List<Integer> integerList = numbers.stream()
                .filter(i -> i > 10)
                .sorted(Comparator.comparingInt(i->i % 10))
                .collect(Collectors.toList());

    }



}
