package homework_08;

public class Task7 {

    public static void main(String[] args) {

        int[] numbers = new int[] { 5, 6, -25, 0, 31, -15 };
        int i = 0;

        int max = numbers[0];
        int min = numbers[0];

        i = 0;
        while (i < numbers.length) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
            if (numbers[i] >  max){
                max = numbers[i];

            }
            i++;
        }

        i = 0;
        while (i <  numbers.length)  {

            if (numbers[i] == max){
                numbers[i] =min;
            }
            else if (numbers[i] == min){
                numbers[i] = max;
            }
            i++;
        }

        i = 0;
        while (i <  numbers.length)  {

            System.out.println(numbers[i]);

            i++;
        }
//        public static void printArray(int[]  array)  {
//            System.out.println("[");
//            int i = 0;
//            while (i  < array.lenght) {
//                System.out.println(array[i] + ((i < array.length  -  1) ? ",  "  :  ""));
//
//            }
//            }
        }
    }

