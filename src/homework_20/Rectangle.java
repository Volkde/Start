package homework_20;

public class Rectangle extends Shape {

    double width;
    double height;
    public double area;

    public void setDimensions (double width,double height) {
        this.width = width;
        this.height = height;
    }


    public void calculateArea() {
        area = (width * height);
        System.out.println(area);
    }




}
