package cn.legeyung.study06;

/**
 * 局部变量和全局变量的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Variable {
	static int i;
	static private int sum;
	int j;
	final int k = 10;

	public void sum() {
		sum = 0;
		for (j = 1; j < 11; j++) {

			sum = sum + j;
		}
		System.out.println("从1到10累计相加结果：" + sum);
		System.out.println("常量k的值是" + k);
	}

	public static void main(String[] args) {
		sum = 0;
		for (i = 1; i < 11; i++) {

			sum = sum + i;
		}
		System.out.println("从1到10累计相加结果：" + sum);

		Variable var = new Variable();
		var.sum();
	}
}
