package homework05;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку четной длины:");
        String name = scanner.nextLine();

        int q = name.length() / 2;
//        System.out.println(q);
        char name1  = name.charAt(q  - 1);
        char name2 = name.charAt(q);
        System.out.println( " " + name1 + name2);



    }
}
