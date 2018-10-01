package org.gaozou.book.javaabc.examples.ch22;

import java.util.LinkedList;

/**
 * @author TuringEmmy
 *
 */
public class LinkStack<T> implements Stack<T> {
    private LinkedList<T> stack = new LinkedList<T>();

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void push(T t) {
        stack.addFirst(t);
    }

    public T peek() {
        return stack.getFirst();
    }

    public T pop() {
        return stack.removeFirst();
    }


    public static void main(String[] args) {
        LinkStack<String> ls = new LinkStack<String>();
        ls.push("apple");
        ls.push("orenge");
        ls.push("banana");

        System.out.println(ls.pop());
        System.out.println(ls.peek());
        System.out.println(ls.pop());
        System.out.println(ls.isEmpty());
    }
}
