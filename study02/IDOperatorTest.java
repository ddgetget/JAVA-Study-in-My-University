package cn.legeyung.study02;


/**
 * 
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class IDOperatorTest {
    public static void main(String[] args) {
        //定义四个变量，并使用递加
        int a = 1;
        int b = 1;
        int c = a++;
        int d = b++;
        //将结果分别打印输出
        System.out.println("a的值是：" + a);
        System.out.println("b的值是：" + b);
        System.out.println("c的值是：" + c);
        System.out.println("d的值是：" + d + "\n");
        //定义四个变量，并使用递减
        int e = 5;
        int f = 5;
        int g = e--;
        int h = f--;
        //将结果分别打印输出
        System.out.println("e的值是：" + e);
        System.out.println("f的值是：" + f);
        System.out.println("g的值是：" + g);
        System.out.println("h的值是：" + h);

    }
}
