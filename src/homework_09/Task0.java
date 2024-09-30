package homework_09;

import java.util.Scanner;

public class Task0 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше  слово:  ");

        printNumbers(scanner.nextLine());

    }


    public static void printNumbers(String input)  {

        int  i  = 1;
        int  num1 = 0;

        if (i <= input.length()) {

            num1 = input.length();
            System.out.println(num1);
        } else {
            System.out.println("Строка Пустая: ");
        }


    }

    public static void printStringLength(String string) {
        System.out.println("Длина строки: "  + string.length());

    }
}
