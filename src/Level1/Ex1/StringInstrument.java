package Level1.Ex1;

public class StringInstrument extends Instrument {

    {
        System.out.println("This block executes every time an object (StringInstrument) is created");
    }

    static void printStatic() {
        System.out.println("Static methods (String Instrument)");
    }

    public StringInstrument() {
        super();
    }

    public StringInstrument(String nombre, double price) {
        super(nombre, price);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public void play() {
        System.out.println("You are playing a string instrument");
    }
}
