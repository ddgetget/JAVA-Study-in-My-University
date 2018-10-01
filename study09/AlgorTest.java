package cn.legeyung.study09;

/**
 * 接口的学习,以及对象的引用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class AlgorTest {
	public static void main(String[] args) {
		Algor al = new Algor();
		ladd ad = al;
		lsub su = al;
		lmul lm = al;
		lumul lu = al;
		System.out.println("这是使用对象引用来调用方法：");
		System.out.println("a+b的值是：" + al.add(6, 3));
		System.out.println("a-b的值是：" + al.sub(6, 3));
		System.out.println("a*b的值是：" + al.mul(6, 3));
		System.out.println("a/b的值是：" + al.umul(6, 3));
		System.out.println("下面这是使用接口引用调用方法：");
		System.out.println("a+b的值是：" + ad.add(9, 3));
		System.out.println("a-b的值是：" + su.sub(9, 3));
		System.out.println("a*b的值是：" + lm.mul(9, 3));
		System.out.println("a/b的值是：" + lu.umul(9, 3));
	}

}

interface ladd {
	int add(int a, int b);
}

interface lsub {
	int sub(int a, int b);
}

interface lmul {
	int mul(int a, int b);
}

interface lumul {
	int umul(int a, int b);
}

class Algor implements ladd, lsub, lmul, lumul {

	public int add(int a, int b) {
		return a + b;
	}

	public int sub(int a, int b) {
		return a - b;
	}

	public int mul(int a, int b) {
		return a * b;
	}

	public int umul(int a, int b) {
		return a / b;
	}

}
