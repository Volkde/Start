package homework_08;

public class Task1 {
    public static void main(String[] args) {

        int number  = 1;
        int multi1  = 1;
        while (number <= 15) {

           multi1 *= number;
            number++;

        }
        System.out.println("Результат: " + multi1);
    }


}
