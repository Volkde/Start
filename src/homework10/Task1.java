package homework10;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите длину массива: ");
        int num1 = scanner.nextInt();

        int[] array = {0, 1, 2, 3, 4, 5, 6};

        array = copyOfArray(array, num1);


        for (int i = 0; i < num1;  i++) {

            System.out.print(array[i]);
        }


    }




    public static int[] copyOfArray(int[] newArray, int num1) {

        int[] array = new int [num1];

        int  i = 0;
        for (i = 0; i  < num1; i++ ) {
            array[i] = 0;
        }
        for (i = 0; i  < num1 &&  i < newArray.length; i++ ) {
            array[i] = newArray[i];
        }
        return(array);
    }
}
