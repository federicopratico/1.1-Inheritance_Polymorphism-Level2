package Level2.Ex1;

public class Smartphone extends Phone implements Camera, Clock{
    public Smartphone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void photograph() {
        System.out.println("A photo is being taken");
    }

    @Override
    public void alarm() {
        System.out.println("The alarm is ringing");
    }
}
