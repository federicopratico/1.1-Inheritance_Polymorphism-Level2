package Level1.Ex1;

import java.util.Scanner;

public abstract class Instrument {
    private String name;
    private double price;

    {
        System.out.println("This block executes every time an object is created (Instrument - SuperClass)");
    }

    static {
        System.out.println("This block executes when a class is loaded");
    }

    public Instrument() {
        this.name = "";
        this.price = 0.0;
    }

    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract void play();
}
