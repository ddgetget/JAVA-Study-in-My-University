package org.gaozou.book.javaabc.examples.ch22;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author TuringEmmy
 *
 */
public class LinkedListRemove {
    private static LinkedList<String> link = new LinkedList<String>();

    public static void main(String[] args) {
        link.addAll(0, Arrays.asList(
                "First.",
                "Second",
                "Third",
                "Fourth",
                "Fifth",
                "Fifth",
                "Sixth",
                "Sixth"
        ));
        echo("所有元素");

        link.remove();
        echo("执行 remove() 后");

        link.remove(0);
        echo("执行 remove(0) 后");

        link.remove("Third");
        echo("执行 remove(\"Third\") 后");

        link.removeFirst();
        echo("执行 removeFirst() 后");

        link.removeFirstOccurrence("Fifth");
        echo("执行 removeFirstOccurrence(\"Fifth\") 后");

        link.removeLast();
        echo("执行 removeLast() 后");

        link.removeLastOccurrence("Fifth");
        echo("执行 removeLastOccurrence(\"Fifth\") 后");

    }

    public static void echo(String action) {
        System.out.println("");
        System.out.println(action);
        System.out.println("-------------------------");
        for (int i = 0; i < link.size(); i++) {
            System.out.println(i + " : " + link.get(i));
        }
        System.out.println("-------------------------");
    }
}
