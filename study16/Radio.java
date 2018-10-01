package org.gaozou.book.javaabc.examples.ch16;

/**
 * @author TuringEmmy
 *
 */
public class Radio {
    private String brand() {
        System.out.println("A famous brand: YongSheng");
        return "YongSheng";
    }

    protected void turnOn() {
        System.out.println("The radio is turned on.");
    }

    protected void turnOff() {
        System.out.println("The radio is turned off.");
    }

    public void play(String music) {
        System.out.println("The radio is playing " + music + ".");
    }

    public void play(String singer, String music) {
        System.out.println("The radio is playing " + music + " of " + singer + ".");
    }

    public static void furnish() {
        System.out.println("This is a Radio.");
    }
}
