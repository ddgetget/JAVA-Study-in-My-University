package org.gaozou.book.javaabc.examples.ch22;

import java.util.LinkedList;

/**
 * @author TuringEmmy
 *
 */
public class LinkQueue<T> implements Queue<T> {
    private LinkedList<T> queue = new LinkedList<T>();

    public void insert(T t) {
        queue.addLast(t);
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public T remove() {
        return queue.removeFirst();
    }


    public static void main(String[] args) {
        LinkQueue<String> lk = new LinkQueue<String>();
        lk.insert("Bentley");
        lk.insert("Audi");
        lk.insert("BMW");

        System.out.println(lk.remove());
        System.out.println(lk.remove());
        System.out.println(lk.remove());
        System.out.println(lk.isEmpty());
    }
}
