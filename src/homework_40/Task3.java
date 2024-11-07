package homework_40;

import java.util.*;

public class Task3 {

    public static void main(String[] args) {

        String string = "abcdefj ab,cdf,";
        System.out.println(getFirstUniqueChar(string));
    }

    public static Character getFirstUniqueChar(String input) {

        Map<Character, Integer> charCountMap = new LinkedHashMap<>();


        for (char c : input.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }


        for (char c : input.toCharArray()) {

            if (charCountMap.get(c) == 1) {
                return c;

            }
        }

        return null;
    }


}
