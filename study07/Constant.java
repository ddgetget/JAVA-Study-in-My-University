package cn.legeyung.study07;

/**
 * (Constant)常数的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Constant {
	public static void main(String[] args) {
		ConstantTest ct = new ConstantTest();
		System.out.println("a的值是：" + ct.print());

	}
}

class ConstantTest {
	int print() {
		final int a = 10;
		return a;
	}
}
