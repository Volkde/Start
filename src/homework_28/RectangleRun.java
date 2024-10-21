package homework_28;

public class RectangleRun {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(5.0, 3.0);
        System.out.println(rectangle1.toString());

        Rectangle rectangle2 = new Rectangle(5.0, 3.0);
        System.out.println(rectangle2.toString());

        Rectangle rectangle3 = new Rectangle(4.0, 2.0);
        System.out.println(rectangle2.toString());


        System.out.println(rectangle1.equals(rectangle2)); // Должно быть true
        System.out.println(rectangle1.equals(rectangle3)); // Должно быть false
    }
}
