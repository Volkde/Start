package lesson_40.list;

import java.util.*;

public class ListExample {

    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection = new HashSet<>();
        collection = new PriorityQueue<>();
        Iterable<Integer> iterable = new ArrayList<>();



        List<Integer> list = new ArrayList<>();
        list = new ArrayList<>(50);
        list = new ArrayList<>(List.of(1,-10,5,0,25,-100));

        list = new LinkedList<>();
        list = new LinkedList<>(List.of(1,-10,5,0,25,-100));

        list.add(1000);
        list.add(-100);

        System.out.println("list: " + list);

        list.add(2,100);
        System.out.println(list);

        int value = list.get(5);
        System.out.println("list.get(5) " + value);

        System.out.println(list.remove(5));
        System.out.println(list);

        list.remove(Integer.valueOf(1000));

        System.out.println("List.indexOf(-100) : " + list.indexOf(-100));
        System.out.println("list.lastIndexOf(-100)" + list.lastIndexOf(-100));

        list.sort((i1, i2) -> i2.compareTo(i1));
        System.out.println(list);

        List<Integer> sublist = list.subList(1,5);
        System.out.println(sublist);



    }

}
