package homework_22;

public class Run {

    public static void main(String[] args) {
        Human human = new Human();
        human.run();

        AmateurAthlete amateurAthlete = new AmateurAthlete();
        amateurAthlete.run();

        SportsmanPro sportsmanPro = new SportsmanPro();
        sportsmanPro.run();



        human.rest();
        amateurAthlete.rest();
        sportsmanPro.rest();



    }


}
