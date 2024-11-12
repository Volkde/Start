package lesson_42;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample2 {
    public static void main(String[] args) {

        Map<Integer, String> mapColors = new HashMap<>();
        mapColors.put(1, "red");
        mapColors.put(16, "green");
        mapColors.put(5, "blue");

        System.out.println(mapColors);

        System.out.println("mapColors.size" + mapColors.size());

        System.out.println("mapColors.containsKey" + mapColors.containsKey(32));
        System.out.println("mapColors.containsValue blue " + mapColors.containsValue("blue"));

        String color = mapColors.get(16);
        System.out.println("color " + color);
        System.out.println(" mapColors.get(100)" + mapColors.get(100));

        String deletedValue = mapColors.remove(100);
        System.out.println("mapColors.remve 100 :" + deletedValue);
        System.out.println(mapColors);

        //mapColors.clear();
        //System.out.println(mapColors);

        System.out.println(mapColors.isEmpty());

        mapColors.put(7, "yellow");
        mapColors.put(8, "white");
        System.out.println(mapColors);

        System.out.println("======================");

        Collection<String> values = mapColors.values();
        System.out.println("values.size(): " + values.size());

        Set<Integer> keys = mapColors.keySet();
        System.out.println("keySet" + keys);

        for(Integer key: keys) {
            System.out.println(mapColors.get(key) + "; ");

        }
        System.out.println();




    }
}
