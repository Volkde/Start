package homework10;

public class Task3 {

    public static void main(String[] args) {

        int[] num1 = {0, 13, -25, 11, 31, 55, 98, 11, 5};
        int[] num2 = findSimple(num1);

        System.out.print("Простые числа: ");
        for (int i = 0; i < num2.length; i++) {
            System.out.print(num2[i] + " ");
        }
    }

    public static int[] findSimple(int[] numbers) {
        int count = 0;
        int[] temp = new int[numbers.length];


        for (int i = 0; i < numbers.length; i++) {
            boolean isSimpleNumber = isSimple(numbers[i]);

            if (isSimpleNumber) {
                temp[count] = numbers[i];
                count++;
            }
        }


        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static boolean isSimple(int num) {
        if (num <= 1) {
            return false;
        }


        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
