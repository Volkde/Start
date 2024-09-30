package homework_08;

import java.util.Random;

public class Task6 {

    public static void main(String[] args) {

        int[] arrayNumber1 = new int[10];
        Random random = new Random();


        int i = 0;
        while (i <  arrayNumber1.length)  {
            arrayNumber1[i]=random.nextInt(100)-50;

            i++;
        }

        i = 0;
        while (i <  arrayNumber1.length)  {

            System.out.println(arrayNumber1[i]);

            i++;
        }
//        System.out.println(arrayNumber1[1] + i != arrayNumber1.length ? System.out.println(", " : "]");
//        int min = ; /

        int max = arrayNumber1[0];
        int min = arrayNumber1[0];
        int sum = 0;

        i = 0;
        while (i < arrayNumber1.length) {
            sum+=arrayNumber1[i];

            if (arrayNumber1[i] < min) {
                min = arrayNumber1[i];
            }
            if (arrayNumber1[i] >  max){
                max = arrayNumber1[i];

            }

            i++;
        }

        int avg = sum/ arrayNumber1.length;
        System.out.println("Минимальное  значние: " + min);
        System.out.println("Максиммальное  значение  " + max);
        System.out.println("Средние  значние " +  avg);


    }
}
