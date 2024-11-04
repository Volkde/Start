package homework_38;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorApp {

    public static void main(String[] args) {


        Sportsman[] sportsmen = {

                new Sportsman("Ivanov", 31, 85),
                new Sportsman("Petrov", 44, 90),
                new Sportsman("Sidorov", 23, 70),
                new Sportsman("Kravchuk", 28, 95)

        };


        Arrays.sort(sportsmen);
        System.out.println("Сортировка по имени (Comparable):");
        System.out.println(Arrays.toString(sportsmen));


        Arrays.sort(sportsmen, new SportsmanScore());
        System.out.println("Сортировка по рейтингу (Comparator):");
        System.out.println(Arrays.toString(sportsmen));


        Arrays.sort(sportsmen, new Comparator<Sportsman>() {

            @Override
            public int compare(Sportsman sportsman1, Sportsman sportsman2) {

                return Integer.compare(sportsman1.getAge(), sportsman2.getAge());

            }

        });

        System.out.println("Сортировка по возрасту (анонимный класс Comparator):");
        System.out.println(Arrays.toString(sportsmen));
    }
}
