package homework_21;

public class Computer extends Component{

    public static void main(String[] args) {
        Processor CPU1 = new Processor("AMD", "Ryzen51600x",3.6,6);
        Memory RAM1 = new Memory("Samsung", "DC-234","DDR5",16000);
        Storage ROM1 = new Storage("Kingston","RXT-3423423", 256);

        System.out.println(CPU1);
        System.out.println(RAM1);
        System.out.println(ROM1);

    }
}
