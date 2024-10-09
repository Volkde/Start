package homework_20;

public class Main {

    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        rec.name = "маленький прямоугольник";
        rec.setDimensions(5, 6);
        rec.displayinfo();
        rec.calculateArea();


        Circle circ=new Circle();
        circ.name = "кружок";
        circ.setRadius(5);
        circ.calculateArea();
        circ.displayinfo();




    }
}
