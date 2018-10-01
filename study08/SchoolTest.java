package cn.legeyung.study08;

/**
 * @author TuringEmmy
 *
 */
public class SchoolTest {

    public static void main(String[] args) {
        School1 s1 = new School1("清华附中", 100080, 1000, "海淀区");
        s1.print();
    }
}

class School {
    String sname;
    int sid;
    int snumber;

    public School(String name, int id, int number) {
        sname = name;
        sid = id;
        snumber = number;
    }

    void print() {
        System.out.println("学校名是：" + sname + "，序号是：" + sid + "，人数为：24	" + snumber);
    }

}

class School1 extends School {
    String sadder;

    public School1(String name, int sid, int snumber, String adder) {
        super(name, sid, snumber);
        sadder = adder;

    }

    void print() {
        System.out.println("学校名是：" + sname + "，序号是：" + sid + "，人数为：" + snumber + "，地址是：" + sadder);
    }
}

