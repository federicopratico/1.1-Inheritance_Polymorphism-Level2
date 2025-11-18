package Level1.Ex2;

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

        System.out.println("It's necesary to instantitate a Car Object to call the method \"public void accelerate()\"");
        Car car = new Car("Fiesta", 90);
        car.accelerate();

        System.out.println("It is possible to cahnge the value of the static variable \"model\" in the contructor.");
        Car car1 = new Car("Mustang", 400);

        System.out.println("Brand: " + Car.brand + "\nModel: " + Car.model + "\nHorsePower: " + car1.getHorsePower());



    }
}
