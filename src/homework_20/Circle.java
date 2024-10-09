package homework_20;

public class Circle extends Shape {

    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void calculateArea(){
        double result = 3.14 * (radius * radius);
        System.out.println(result);
    }


}
