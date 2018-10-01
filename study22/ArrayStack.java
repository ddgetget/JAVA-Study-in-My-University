package org.gaozou.book.javaabc.examples.ch22;

import java.util.EmptyStackException;

/**
 * @author TuringEmmy
 *
 */
public class ArrayStack<T> implements Stack<T> {
    private int top = -1;
    private T[] stack;

    public ArrayStack(int max) {
        stack = (T[]) new Object[max];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(T t) {
        if (top == stack.length - 1) {
            throw new StackOverflowError("The stack is full.");
        }
        stack[++top] = t;
    }

    public T peek() {
        if (top < 0) {
            throw new EmptyStackException();
        }
        return stack[top];
    }

    public T pop() {
        if (top < 0) {
            throw new EmptyStackException();
        }
        return stack[top--];
    }
}
