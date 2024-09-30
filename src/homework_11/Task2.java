package homework_11;

public class Task2 {
    public static void main(String[] args) {

        int[] myArray = {11,8,3,7,33};
        avarege(myArray);

    }

    public static double avarege (int[] num1) {

        double sum = 0;
        for (int  i = 0; i < num1.length; i++) {
            sum = sum  + num1[i];

        }

        double result =  sum / num1.length;
        System.out.println(result);
        return (result);

    }

}

