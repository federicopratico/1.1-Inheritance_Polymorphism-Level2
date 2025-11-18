package Level1.Ex2;


public class Car {
    static final String brand = "Ford";
    static String model;
    final double horsePower;

    static {
        model = "Focus";
    }

    public Car(String model, double horsePower) {
        Car.model = model;
        this.horsePower = horsePower;
    }

    public double getHorsePower() {
        return horsePower;
    }

    static void brake() {
        System.out.println("The vehicle is braking");
    }

    public void accelerate() {
        System.out.println("The vehicle is accelerating");
    }
}
