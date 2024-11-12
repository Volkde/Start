package homework_43;

import java.util.List;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Alice", 30, "Berlin"),
                new Person("Bob", 20, "Berlin"),
                new Person("Charlie", 28, "Munich"),
                new Person("David", 35, "Berlin")
        );
        List<Person> filteredPeople = filterPeople(people, 25, "Berlin");

        System.out.println("Исходный список: " + people);
        System.out.println("Отфильтрованный список: " + filteredPeople);
    }


    public static class Person {

        String name;
        int age;
        String city;

        public Person(String name, int age, String city) {

            this.name = name;
            this.age = age;
            this.city = city;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", city='" + city + "'}";
        }
    }


    public static List<Person> filterPeople(List<Person> people, int minAge, String city) {

        return people.stream()
                .filter(person -> person.age > minAge)
                .filter(person -> person.city.equals(city))
                .collect(Collectors.toList());
    }


}
