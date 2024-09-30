package homework_15;

public class Table {
    String color;
    String material;
    double length;
    double width;

    public Table(String color, String material, double length, double width) {
        this.color = color;
        this.material = material;
        this.length = length;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Table Color: " + color);
        System.out.println("Material: " + material);
        System.out.println("Length: " + length + " meters");
        System.out.println("Width: " + width + " meters");
    }


}
