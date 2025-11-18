package Level1.Ex1;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println("CALLING STATIC ATTRIBUTE OR METHOD:");
        StringInstrument.printStatic();

        System.out.println("CREATING A STRING INSTRUMENT:");
        StringInstrument guitar = new StringInstrument("Fender-Stratocaster", 400.99);
        System.out.println("CREATING A WIND INSTRUMENT:");
        WindInstrument trumpet = new WindInstrument("Trumpet", 250);
        System.out.println("CREATING A PERCUSSION INSTRUMENT:");
        PercussionInstrument drum = new PercussionInstrument("Drum", 1240);

        Instrument[] instruments = {guitar, trumpet, drum};
        for(Instrument i : instruments) {
            System.out.printf("Name: %s\nPrice: %.2f\n", i.getName(), i.getPrice());
            i.play();
            System.out.println();
        }


    }
}
