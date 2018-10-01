package org.gaozou.book.javaabc.examples.ch16;

/**
 * @author TuringEmmy
 *
 */
public class ClassTest {
    public static void main(String[] args) {
        try {
            //加载指定的类
            Class cs = Class.forName("cn.com.ch16.Son");
            Son myson = (Son) cs.newInstance();
            //调用创建对象的方法
            System.out.println("调用创建对象的方法:");
            myson.methodSonProtected();
            myson.methodSonPublic();
            myson.methodFather();
            //加载类的详细信息
            System.out.println("加载类的信息:");
            System.out.println(cs.getName() + "自己声明了" +
                    cs.getDeclaredFields().length + "个成员变量");
            System.out.println(cs.getName() + "类对外公布的方法有" +
                    cs.getMethods().length + "个");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Father {
    //父类的公共成员变量
    public int memberFather;
    //父类中的公共方法

    public void methodFather() {
        System.out.println("这是从父类中继承而来的方法methodFather");
    }
}

class Son extends Father {
    //子类的额公共成员变量
    public int memberSonPublic;
    //子类的私有成员变量
    private int memberSonPrivate;
    //子类的公共方法

    public void methodSonPublic() {
        System.out.println("这是子类自己的方法methodSonPublic");
    }

    public void methodSonProtected() {
        System.out.println("这是子类自己的方法methodSonProtected");
    }
}
