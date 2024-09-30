package homework_15;


    public class Beer {
        String brand;
        double volume;
        String type;


        public Beer(String brand, double volume, String type) {
            this.brand = brand;
            this.volume = volume;
            this.type = type;
        }

        public void displayInfo() {
            System.out.println("Brand: " + brand);
            System.out.println("Volume: " + volume);
            System.out.println("Type: " + type);
        }
    }

