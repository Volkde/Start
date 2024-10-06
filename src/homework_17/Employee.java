package homework_17;

    public class Employee {
        private String name;
        private int age;
        private int salary;

        public Employee(String name, int age, int salary) {
            this.name = name;
            this.age = age;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        private int getAge() {
            return age;
        }

        private int getSalary() {
            return salary;
        }

        private void info() {

            System.out.println(name);
            System.out.println(age);
            System.out.println(salary);
        }
    }
