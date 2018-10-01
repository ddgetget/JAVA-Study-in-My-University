package org.gaozou.book.javaabc.examples.ch16;

/**
 * @author TuringEmmy
 *
 */
public class House {
    public String owner;
    protected int space;
    private int price;
    public String address;
    private static String name;

    public House() {
    }

    public House(String owner, int space, int price, String address, String n) {
        this.owner = owner;
        this.space = space;
        this.price = price;
        this.address = address;
        name = n;
    }
}

