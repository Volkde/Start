package homework_08;

import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String enter = "";
        int i = 1;

        boolean hello = false;
        while(!hello){
            System.out.println("попытка номер " +i);
            System.out.println("введите слово");
            enter = scanner.nextLine();
            i++;

            if (enter.equals("hello"))  {
                hello = true;
                System.out.println("Спасибо!");
            }
        }
    }
}
