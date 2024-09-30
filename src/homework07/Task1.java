package homework07;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввелидите число 1 2 или 3: ");

        String newNum1  = scanner.nextLine();

        if (newNum1.equals("1") ) {
            System.out.println("Один");
        } else if (newNum1.equals("2")) {
            System.out.println("Два");
        } else if (newNum1.equals("3")) {
            System.out.println("Три");
        }


    }
}
