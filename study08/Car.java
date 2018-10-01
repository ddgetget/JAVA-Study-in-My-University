package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class Car extends Auto {
    public String name = "a nice car";

    public void engine() {
        System.out.println("a nice engine");
    }

    public static void run() {
        System.out.println("fast");
    }

    public void fun() {
        super.engine();
    }

    public static void main(String[] args) {
        Auto auto = new Car();
        System.out.println(auto.name); // 类属性
        auto.price(); // 父类final方法
        auto.run();  // 父类静态方法
        auto.fun(); // super关键字
    }
}

