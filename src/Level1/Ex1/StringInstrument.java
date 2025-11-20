package Level1.Ex1;

public class StringInstrument extends Instrument {

    {
        System.out.println("I'm " + super.getName() + ". This is my initialization block which executes every time an object of my class is created.\n" +
                "In this block it's possible to use 'this' or 'super' reference.");
    }

    static {
        System.out.println("It's the static block from StringInstrument, I execute only once when my class is loaded\n");
    }


    static void printStatic() {
        System.out.println("Static methods (String Instrument). My call caused the class to load");
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
