package org.gaozou.book.javaabc.examples.ch22;

/**
 * @author TuringEmmy
 *
 */
public interface Stack<T> {
    boolean isEmpty();

    void push(T t);

    T peek();

    T pop();
}
