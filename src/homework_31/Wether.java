package homework_31;

public class Wether {

    public static void printAverageTemp(Season season) {
        switch (season){
            case FALL:
                System.out.println("+7");
                break;
            case SPRING:
                System.out.println("+15");
                break;
            case SUMMER:
                System.out.println("+23");
                break;
            case WINTER:
                System.out.println("-5");
                break;
        }
    }

    public static void main(String[] args) {
        printAverageTemp(Season.FALL);
    }
}
