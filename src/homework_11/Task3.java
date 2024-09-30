package homework_11;

public class Task3 {
    public static void main(String[] args) {

        int[] myArray = {11,8,3,3,8,11};
        palindrome(myArray);

    }
    public static void palindrome (int[] num1) {

        for(int i  = 0; i < (num1.length / 2);  i++) {
           if  (num1[i] == num1[ num1.length - 1 -i])  {
               continue;

           } else {
               System.out.println("Не  палиндром");
               return;
           }

        }
        System.out.println("Это палиндром");

    }
}