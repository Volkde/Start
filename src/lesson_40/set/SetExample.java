package lesson_40.set;

import java.util.*;

public class SetExample {

    //контракт между equals() и hashCode()
    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set = new HashSet<>(20);
        set = new HashSet<>(List.of(1,2,3,4,5,6,6,5,3));

        System.out.println(set);

        List<Integer> startValues = new ArrayList<>(List.of(15,1,2,3,4,3,8,6,15,7,0,16,32));
        System.out.println(startValues);

        Set<Integer> integers = new HashSet<>(startValues);
        System.out.println("integers hashSet: " + integers);

        Set<Integer> linkedSet = new LinkedHashSet<>(startValues);
        System.out.println("linkedSet: " + linkedSet);

        System.out.println("integers.add(100) " + integers.add(100));
        System.out.println("integers.add(100) 2 " + integers.add(100));

        System.out.println("integers.remove(100)" + integers.remove(100));
        System.out.println(integers);
        System.out.println("integers.remove(100) 2" + integers.remove(100));

        System.out.println("/n ============================== \n");
        System.out.println("integers.contains(100)" + integers.contains(100));




    }
}
