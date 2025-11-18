package Level1.Ex1;

public class PercussionInstrument extends Instrument {

    {
        System.out.println("This block executes every time an object (PercussionInstrument) is created");
    }

    static void printStatic() {
        System.out.println("Static methods (Percussion Instrument)");
    }

    public PercussionInstrument() {
        super();
    }

    public PercussionInstrument(String nombre, double price) {
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
        System.out.println("You are playing a percussion instrument");
    }
}
