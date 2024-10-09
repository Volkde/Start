package homework_20.irarchia;

public class Colla extends Getränk {

    boolean zucker =true;


    public Colla(String brand, boolean zucker) {
        this.brand = brand;
        this.zucker = zucker;
    }

    public void displayInfo() {

        System.out.println(brand+"  "+ volume+"ml  zucker "+ zucker);
    }
}
