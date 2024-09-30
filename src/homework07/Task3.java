package homework07;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввелидите четырех значное число: ");

       //String newNum1  = scanner.nextLine();
        int newNum1 = scanner.nextInt();

        if (newNum1 < 1000 && newNum1 >= 10000 ) {
            System.out.println("Ошибка! Вы ввели не правильное число! " + newNum1);
        } else {
           // (newNum1.charAt()) 5437
            int foursNum = newNum1 % 10;
            int thirdNum = (newNum1/10) % 10;
            int secondNum = (newNum1/100) % 10;
            int firstNum = newNum1 /1000;

            if(firstNum+secondNum==thirdNum+foursNum){
                System.out.println("Счасливое число");
            }
            else{
                System.out.println("не счастливое");
            }
        }

    }
}
