package homework_21;

public class Memory extends Component{

    public String type;
    public int volume;

    public Memory(String brand, String model,String type, int volume) {
        super.brand = brand;
        super.model = model;
        this.type = type;
        this.volume = volume;

    }
    public void setType(String type) {
        this.type = type;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String toString(){
        return  super.toString() + " type :" + type + " volume :" + volume;
    }
}
