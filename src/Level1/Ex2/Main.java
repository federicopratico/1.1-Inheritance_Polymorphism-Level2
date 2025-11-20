package Level1.Ex2;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("Can access and print Car.brand because is a static fields");
        System.out.println(Car.brand);
        System.out.println();

        System.out.println("Can't modify Car.brand because is final");
//        Car.brand = "Nissan";  // COMPILER ERROR
        System.out.println();

        System.out.println("Can modify the Car.model attribute");
        System.out.println("Car.model: " + Car.model);
        Car.model = "Fiesta";
        System.out.println("Car.model after modification: " + Car.model);
        System.out.println();

        System.out.println("Can call the static method \"static void brake()\" without instantiating an object of that type.");
        Car.brake();
        System.out.println();

        System.out.println("It's necessary to instantiate a Car Object to call the method \"public void accelerate()\"");
        System.out.println("CREATING A CAR OBJECT...");
        Car car = new Car("Fiesta", 90);
        System.out.println("Variable name: car\n" + "Brand: " + Car.brand + "\nModel: " + Car.model + "\nHorsePower: " + car.getHorsePower());
        System.out.println();
        car.accelerate();
        System.out.println();

        System.out.println("It is possible to change the value of the static variable \"model\" in the constructor.");
        System.out.println("CREATING A SECOND CAR OBJECT...");
        Car car1 = new Car("Mustang", 400);

        System.out.println("Variable name: car1\n" + "Brand: " + Car.brand + "\nModel: " + Car.model + "\nHorsePower: " + car1.getHorsePower()+"\n");

        System.out.println("Variable name: car\n" + "Brand: " + Car.brand + "\nModel: " + Car.model + "\nHorsePower: " + car.getHorsePower()+"\n");

        System.out.println("The creation of a second Car object caused the changing of the static attribute Car.model.\n" +
                "Now the Car.Model attribute of all cars is the same of the object pointed to car1 variable.");

    }
}
