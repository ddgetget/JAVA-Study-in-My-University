package org.gaozou.book.javaabc.examples.ch22;

/**
 * @author TuringEmmy
 *
 */
public interface Queue<T> {
    void insert(T t);

    boolean isEmpty();

    T remove();
}
