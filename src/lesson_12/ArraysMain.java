package lesson_12;

import java.util.Arrays;
import java.util.Random;

public class ArraysMain {

    public static void main(String[] args) {

        int[] ints = {34, 22, 67, 41, 10, 90, 0 , 87,  99, 38, 57, 3, 77} ;
        System.out.println(ints.length);

        int  index = ArraysUtilis.linearSearch(ints, 100);
        System.out.println("index"  + index);

        System.out.println("Массив до сортирорвки:");
        System.out.println( Arrays.toString(ints));

        ArraysUtilis.sortSelection(ints);

        System.out.println("Массив после сортирорвки:");
        System.out.println(Arrays.toString(ints));

        int number = 87;
        int idx =  ArraysUtilis.binarySearch(ints, number);
        System.out.println("index number" + idx);


        int[]  testArray = new int[100_000];
        Random random = new Random();

        for (int i =0;  i < testArray.length;  i++)  {
            testArray[i] = random.nextInt(10_001);

        }

        ArraysUtilis.sortSelection(testArray);
        number = 9900;
        idx = ArraysUtilis.binarySearch(testArray, number);
        System.out.println("index in test array "  + idx);

        idx  = ArraysUtilis.linearSearch(testArray,  number);
        System.out.println("index in line search " + idx );

    }
}
