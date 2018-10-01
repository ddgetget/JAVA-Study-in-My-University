package cn.legeyung.study14;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class AgeTest {
    //在测试类中使用自己定义的异常类

    public static void main(String args[]) {
        //调用的方法可能会抛出异常
        try {
            String name = "张三";                    //创建姓名变量
            String name2 = "李四";
            String level = null;
            level = AgeLevel(20);
            System.out.println(name + "是：" + level);
            level = AgeLevel(140);
            System.out.println(name2 + "是：" + level);
        }
        catch (IllegalAgeException e) {
            e.printStackTrace();
        }
    }
    //定义的方法可能会产生异常

    static String AgeLevel(int age) throws IllegalAgeException {
        if (age >= 10 && age < 18)
            return "小孩";
        else if (age >= 18 && age < 30)
            return "小伙子";
        else if (age >= 30 && age < 40)
            return "中年人";
        else if (age < 60 && age >= 100)
            return "老年人";
        else
            //抛出异常
            throw new IllegalAgeException("非法的年龄");
    }
}

class IllegalAgeException extends Exception {//自定义异常继承Exception类
    //创建异常的构造方法

    IllegalAgeException() {
    }
    //创建异常的有参数的构造方法

    IllegalAgeException(String msg) {
        super(msg);                        //调用父类中的构造方法
    }
}

