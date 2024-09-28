package homework_14;

public class Task2 {

    public static void main(String[] args) {
        int[] array =  {2, 4, 11, 14, 76, 46,  17,  21,  66};
        oddNum(array);

        int result  =  oddNum(array);
        System.out.println(result);


    } // end method main

    public  static int oddNum(int[] num1) {

        int sum  = 0;
        for(int i =0; i < num1.length; i++) {
            if(num1[i]  % 2  == 0) {
                sum  +=  num1[i];
            }

        }
        return  sum;
    }

}