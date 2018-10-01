package org.gaozou.book.javaabc.examples.ch15;

/**
 * @author TuringEmmy
 *
 */
public class People {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public People(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
}
