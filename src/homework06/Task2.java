package homework06;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random =  new Random();

        int a = random.nextInt(50);
        int b = random.nextInt(100);

        System.out.print(a);
        System.out.print(" ");
        System.out.print(b);
        System.out.print(" ");
        System.out.println( a == b);
        System.out.println( a != b);
        System.out.println( a > b);
        System.out.println( a < b);


    }
}
