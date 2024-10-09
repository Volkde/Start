/**package homework_19;

/**
 * @author Sergey Bugaenko
 * {@code @date} 08.10.2024


Task 1
Класс "Калькулятор"
Создайте класс Calculator, который будет предоставлять

базовые арифметические операции: сложение, вычитание, умножение и деление
Класс должен содержать:

Статические методы для каждой математической операции, принимающие два аргумента и возвращающие результат операции.


public class Calculator {


    final int MAX_USERS = 100;

    public static int ImmutablePoint()  {

    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int add(int a, int... ints) {
        int sum = a;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        return sum;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            return Integer.MAX_VALUE;
        }
        return a / b;
    }


    public static double circ(int r) {
        return (3.14 * 2 * r);
    }
    public static double sq(int r) {
        return (3.14 * r * r);
    }

    public class FinalUsers {
        public static final int MAX_USERS = 100;

        public static void main(String[] args) {
            // MAX_USERS = 500;
        }
    }

    public class ImmutablePoint {


        private final int x;
        private final int y;
        public ImmutablePoint(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }


    }

        public static void main(String[] args) {
            // MAX_USERS = 200; // Это вызовет ошибку компиляции!
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        return a / b;
    }

}
*/