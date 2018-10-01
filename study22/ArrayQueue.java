package org.gaozou.book.javaabc.examples.ch22;

/**
 * @author TuringEmmy
 *
 */
public class ArrayQueue<T> implements Queue<T> {
    private int front = -1, rear = -1;
    private T[] queue;

    public ArrayQueue(int max) {
        queue = (T[]) new Object[max];
    }

    public void insert(T o) {
        if (rear == queue.length - 1) {
            throw new FullQueueException();
        }
        queue[++rear] = o;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public boolean isFull() {
        return rear == queue.length - 1;
    }

    public T remove() {
        if (front == rear) {
            throw new EmptyQueueException();
        }
        return queue[++front];
    }

    private static class FullQueueException extends RuntimeException {
    }

    private static class EmptyQueueException extends RuntimeException {
    }
}
