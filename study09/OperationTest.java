package cn.legeyung.study09;

/**
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class OperationTest {
	public static void main(String[] args) {
		OTest ot = new OTest();
		System.out.println("a+b的值是：" + ot.add(15, 3));
		System.out.println("a-b的值是：" + ot.sub(15, 3));
		System.out.println("a*b的值是：" + ot.mul(15, 3));
		System.out.println("a/b的值是：" + ot.umul(15, 3));
	}

}

interface Oadd {
	int add(int a, int b);
}

interface Osub {
	int sub(int a, int b);
}

interface Omul {
	int mul(int a, int b);
}

interface Oumul {
	int umul(int a, int b);
}

class OTest implements Oadd, Osub, Omul, Oumul {

	public int add(int a, int b) {
		// add方法的具体实现
		return a + b;
	}

	public int sub(int a, int b) {
		// sub方法的具体实现
		return a - b;
	}

	public int mul(int a, int b) {
		// mul方法的具体实现
		return a * b;
	}

	public int umul(int a, int b) {
		// umul方法的具体实现
		return a / b;
	}

}
