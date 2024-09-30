package lesson_03;

public class Variables {

    public static void main(String[] args) {

        int myFirstVariable; // Объявление (декларирование) переменной типа int


//        присовение значения переменной
//         int myFirstVariable = 1; Первое присвоение значения в переменную называется инициалиазция.

        int mySecondVariable = 25; // Объявление и инциализация в одной строке

        System.out.println(mySecondVariable);

        mySecondVariable = 50;

        System.out.println("Значение переменной: " + mySecondVariable);

        byte byteVariable = 125; // Объявление и инициализация переменной типа byte

            byteVariable = 45;

        System.out.println(byteVariable);

        short shortVar; //Объявление переменной
        shortVar = 31000; // Инициациазция переменной (присовление значений)

        System.out.println("Short value :" + shortVar);

        long longVar = 20_000_000_000L;
        //_ - не влияет на зачение переменной, L - явно указать, что сило в формате long
        System.out.println("Long variables: " + longVar);

        double doubleVar = 10.562;
        System.out.println("Double: " + doubleVar);


    }
}
