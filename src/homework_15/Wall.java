package homework_15;


public class Wall {
        String color;
        double height;
        double width;



    public Wall (String color, double height, double width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }

    public void displayInfo() {
        System.out.println("Wall Color: " + color);
        System.out.println("Height: " + height + " meters");
        System.out.println("Width: " + width + " meters");
    }
}

