package lesson_19;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {

        int[] array = {3,2,1,0};

        String arrayToString = Arrays.toString(array);
        System.out.println(arrayToString);
        System.out.println(Arrays.toString(array));

        System.out.println("Sortirovka arrays ======== ");
        Arrays.sort(array);
        Arrays.sort(array, 1, 3);

        System.out.println(Arrays.toString(array));


        System.out.println("Binary Search ====================");

        int index = Arrays.binarySearch(array, 50);
        System.out.println("Index: " + index);

        System.out.println("Compare arreys = ==============================");

        //int[] test = {0,1,2,3};
        int[] test = {0,2,1,3};
        System.out.println("arrays.equals(test): " + array.equals(test));
        boolean isArraysEquals = Arrays.equals(array,test);
        System.out.println("Arrays.equals(array, test): " + isArraysEquals);

        int mismatchIndex = Arrays.mismatch(array, test);
        System.out.println("Arrays.mismatch(array, test): " + mismatchIndex);



    }
}
