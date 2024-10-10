package homework_21;

public class Component {
    protected String brand;
    protected String model;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public String toString() {
        return "  brand : " + brand + "  model : " + model;
    }
}
