package homework_24.task1;

public class Triathlete implements Swimmer, Runner{
        @Override
        public void swim(){
            System.out.println("Swim");
        }

        @Override
        public void run() {
            System.out.println("Run");
        }

    public static void main(String[] args) {

            Triathlete triathlete= new Triathlete();
            triathlete.run();

            triathlete.swim();
    }
}
