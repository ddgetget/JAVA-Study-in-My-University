package cn.legeyung.study02;

/**
 * int学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class IntTest {
	public static void main(String[] args) {
		byte m; // byte最大到(-128,127) 2^7-1
		short x; // short范围(-32768,32767) 2^15-1
		int i; // int 范围(-2147483648,2147483647) 2^31-1
		long l; // long范围()

		// 为各类型变量赋值
		m = 127;
		x = -3276;
		i = 2147483647;
		l = 92234;

		// 打印输出各类型变量的值
		System.out.println("byte 类型变量m的值为：" + m);
		System.out.println("short类型变量x的值为：" + x);
		System.out.println("int类型变量i的值为：" + i);
		System.out.println("long 类型变量l的值为：" + l);
	}
}
