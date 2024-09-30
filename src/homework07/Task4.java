package homework07;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число от 1 до 7: ");
        int num1 = scanner.nextInt();

        //System.out.print(num1);

        switch (num1) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case  4:
                System.out.println("Четверг");
                break;
            case  5:
                System.out.println("Пятница");
                break;

            case 6:
                System.out.println("Суббота");
                break;

            case 7:
                System.out.println("Воскресенье");
                break;

            default:
                // Блок кода по умолчанию
                break;
        }

    }
}
