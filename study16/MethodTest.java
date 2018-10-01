package org.gaozou.book.javaabc.examples.ch16;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * @author TuringEmmy
 *
 */
public class MethodTest {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Radio radio = new Radio();
        Class c = radio.getClass();
        Method[] methods = c.getDeclaredMethods();

        System.out.println("共有方法：" + methods.length);
        System.out.println("----------------");
        for (Method m : methods) {
            m.setAccessible(true);
            System.out.println(Modifier.toString(m.getModifiers()) + " " + m.getReturnType().getName() + " " + m.getName());
        }

        System.out.println("\n调用结果：");
        System.out.println("----------------");
        for (Method m : methods) {
            m.setAccessible(true);
            String n = m.getName();
            if (n.equalsIgnoreCase("play")) {
                if (m.getParameterTypes().length == 1) {
                    m.invoke(radio, "I love you more than I can say");
                } else {
                    m.invoke(radio, "Jerry Allison", "I love you more than I can say");
                }
            } else {
                m.invoke(radio);
            }
        }
    }
}
