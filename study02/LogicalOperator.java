package cn.legeyung.study02;

/**
 * boolean运算
 * ^按位异或
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class LogicalOperator {
    public static void main(String[] args) {
        //声明变量x和y，并赋初始值
        boolean x = true;
        boolean y = false;
        //分别打印输出逻辑运算结果
        System.out.println("x&y的值是：" + (x & y));
        System.out.println("x|y的值是：" + (x | y));
        System.out.println("!x的值是：" + !x);
        System.out.println("x&&y的值是：" + (x && y));
        System.out.println("x||y的值是：" + (x || y));
        System.out.println("x^y的值是：" + (x ^ y));
        System.out.println("x^x的值是：" + (x ^ x));
    }
}

