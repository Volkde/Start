package homework_11;

public class Task1 {
    public static void main(String[] args) {

       int[] myArray = {11,8,3,7,45};
       sum(myArray);

    }

    public static int sum (int[] num1) {

        int result = 0;
        for (int  i = 0; i < num1.length; i++) {
            result = result  + num1[i];

        }
        System.out.println(result);
        return (result);

    }

}

