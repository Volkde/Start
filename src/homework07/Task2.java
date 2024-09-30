package homework07;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNum1 = random.nextInt(101);
        System.out.println("Random number: " + randomNum1);

        int randomNum2 = random.nextInt(101);
        System.out.println("Random number: " + randomNum2);

        int randomNum3 = random.nextInt(101);
        System.out.println("Random number: " + randomNum3);

        int randomNum4 = random.nextInt(101);
        System.out.println("Random number: " + randomNum4);

        if (randomNum1  > randomNum2 && randomNum1  > randomNum3 && randomNum1  > randomNum4)  {
            System.out.println("Большее " +randomNum1);
        } else if (randomNum2 > randomNum3 && randomNum2  > randomNum4 ) {
            System.out.println("Большее " +randomNum2);
        } else if (randomNum3 > randomNum4) {
            System.out.println("Большее " +randomNum3);
        } else {
            System.out.println("Большее 4 " +randomNum4);
        }


    }
}
