package homework_08;

public class Task3 {
    public static void main(String[] args) {

    int i = 1;
    int n = 0;
        while (i <= 100) {

            if( i % 5 == 0 ) {
                System.out.println("Кратное пяти " + i);
            }
            if( i % 3 == 0 && n <= 7) {
                System.out.println("На три без остатка " + i);
                n++;
            }
            i++;
        }
    }
}
