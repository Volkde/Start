package homework_39;

import java.util.ArrayList;
import java.util.List;

///Task 1
/// Напишите метод, который принимает на вход две реализации интерфейса List.
///
/// Метод должен возвращать список состоящий из элементов, которые присутствуют в обеих коллекциях.

public class Task1 {
    public static void main(String[] args) {
    List<String> list1 = List.of("Milk","Kasha", "Smetana","Tvorog");
    List<String> list2 = List.of("Kvas","Milk","Brot","Grechka");

    List<String> Diet = findElements(list1, list2);
        System.out.println("Общие элементы " + Diet);

    }

    public static List<String> findElements(List<String> list1, List<String> list2) {

        List<String> result = new ArrayList<String>();

        for (String element : list1) {
            if(list2.contains(element)) {
                result.add(element);
            }
        }

        return result;



    }



}
