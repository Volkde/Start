package homework_20.irarchia;

public class Bier extends Getränk {

    boolean type = true;


    public Bier(boolean type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public void displayInfo() {
        System.out.println(brand+"  "+ type+ ""+ volume);
    }

}
