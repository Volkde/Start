package homework_21;

public class Storage extends Component {

    public int volume;

    public Storage (String brand, String model, int volume) {
        super.brand = brand;
        super.model = model;
        this.volume = volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

        public String toString() {
        return  super.toString() + " volume :" + volume;
        }
}
