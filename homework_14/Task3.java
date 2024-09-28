package homework_14;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[] array =  {2, 4, 11, 14, 76, 46,  17,  21,  66};
        secondMax(array);

        int result  =  secondMax(array);
        System.out.println(result);
    }

    public static int secondMax(int[] num1){

        int[]  sortedArray = Arrays.stream(num1).sorted().toArray();
        return sortedArray[sortedArray.length-2];


    }
}
