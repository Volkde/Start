package homework_38;

public class Sportsman implements Comparable<Sportsman> {

    private String name;
    private int age;
    private int score;

    public Sportsman(String name, int age, int score) {

        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public int compareTo(Sportsman o) {

        return this.name.compareTo(o.name);

    }

    @Override
    public String toString() {
        return "Sportsman{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getScore() {
        return score;
    }
}
