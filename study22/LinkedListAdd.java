package org.gaozou.book.javaabc.examples.ch22;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author TuringEmmy
 *
 */
public class LinkedListAdd {
    private static LinkedList<String> link = new LinkedList<String>();

    public static void main(String[] args) {
        link.add("a");
        link.add("b");
        link.add("c");
        echo();

        link.add(0, "Make the index 0");
        echo();

        link.addFirst("This is the first.");
        echo();

        link.addLast("This is the last.");
        echo();

        link.addAll(Arrays.asList("1", "2", "3"));
        echo();

        link.addAll(0, Arrays.asList("A", "B", "C"));
        echo();

    }

    public static void echo() {
        for (int i = 0; i < link.size(); i++) {
            System.out.println(i + " : " + link.get(i));
        }
        System.out.println("-------------------------");
    }
}
