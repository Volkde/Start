package homework_21;

public class Processor extends Component {

        public double freqancy;
        public int core;

    public Processor(String brand, String model, double freqancy, int core) {
        super.brand = brand;
        super.model = model;
        this.freqancy = freqancy;
        this.core = core;
    }

    public void setFreqancy(double freqancy) {
        this.freqancy = freqancy;
    }

    public void setCore(int core) {
        this.core = core;
    }

    public String toString() {
        return super.toString() + "  freqancy: " + freqancy;
    }
}
