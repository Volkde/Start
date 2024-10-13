package homework_22;

public class RunTask2 {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[5];
        vehicles[0]= new Bicycle();
        vehicles[1]= new Car();
        vehicles[2]= new Motorcycle();
        vehicles[3]= new Motorcycle();
        vehicles[4]= new Bicycle();

        vehicles[0].startEngine();
        vehicles[1].startEngine();
        vehicles[2].startEngine();
        vehicles[3].startEngine();
        vehicles[4].startEngine();

    }
}
