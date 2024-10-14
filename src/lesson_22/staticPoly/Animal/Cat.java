package lesson_22.staticPoly.Animal;

/**
 * @author Sergey Bugaenko
 * {@code @date} 11.10.2024
 */

public class Cat extends lesson_22.animals.Animal {

    // Уникальный функционал кота
    public void eat() {
        System.out.println("Cat eat");
    }

    // Переопределение родительского метода voice()
    @Override
    public void voice() {
        System.out.println("Cat say MEOW!!!");
    }

    @Override
    public String toString() {
        return "Cat toString";
    }

    // Перегрузка метода - статический полиморфизм
    public void voice(String str) {
        System.out.println("Cat say " + str);
    }
}
