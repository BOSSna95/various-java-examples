package org.example;

import javax.sound.midi.SysexMessage;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vehicle BMW = new Vehicle();
        BMW.setcolour("red");
        BMW.setseats(4);
       /* BMW.consumption = 6;
        BMW.used = true;*/

        System.out.println("The BMW colour is " + BMW.getcolour() + "!");
        System.out.println("The BMW has " + BMW.getseats() + " seats!");
        System.out.println("The BMW colour is " + BMW.getcolour());
        System.out.println("The BMW colour is " + BMW.getcolour());



    }
}
