package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class ClassTest {
    public static void main(String[] args) {
        Student stu = new Student();
        stu.name = "张三";
        stu.age = 20;
        stu.print();
        stu.print("李四", 21);
        stu.print("王五", 22, 10);
        stu.print("赵六", 22, 11, 80);

    }
}

class Student {
    String name;
    int age;

    void print() {
        System.out.println("姓名：" + name + "年龄：" + age);
    }

    void print(String name1, int age1) {
        System.out.println("姓名：" + name1 + "年龄：" + age1);
    }

    void print(String name2, int age2, int id) {
        System.out.println("姓名：" + name2 + "年龄：" + age2 + "学号是：" + id);
    }

    void print(String name3, int age3, int id3, double a) {
        System.out.println("姓名：" + name3 + "年龄：" + age3 + "学号是：" + id3 + "成绩是：" + a);
    }
}

