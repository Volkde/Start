package lesson_05;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ener you name: ");

        String name  = scanner.nextLine();

        System.out.println("Продолжение прогнраммы name: " + name);

        //прочитать целое число

        System.out.println("Введите  ваш возраст: ");
        int age = scanner.nextInt();  //Считать одно число тиипа  int
        scanner.nextLine(); //скушать остаток строки

        System.out.println("age " + age);

        System.out.println("Введите ваш  возраст в  см");
        double height = scanner.nextDouble();

        System.out.println(height);



    }
}
