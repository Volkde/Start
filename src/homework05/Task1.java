package homework05;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите  ваше имя: ");
        String name = scanner.nextLine();
//        System.out.println(" Привет  : "  + name);

        System.out.println(name.length());

        char str1 = name.charAt(0);
        System.out.println(str1);
        char str2 = name.charAt(name.length() -  1);
        System.out.println(str2);

        System.out.println((int) str1);
        System.out.println((int) str2);

    }
}
