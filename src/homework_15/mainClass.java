package homework_15;

public class mainClass {
    public static void main(String[] arge) {
        Wall wall = new Wall("White", 2.10, 14.5);
        Table table = new Table("White", "Wood", 1.2, 0.6);
        Beer beer = new Beer("Paulaner", 0.5, "Пшеничное");
        wall.displayInfo();
        table.displayInfo();
        beer.displayInfo();

    }
}
