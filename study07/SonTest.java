package cn.legeyung.study07;

/**
 * 子类的测试、 继承以及接口的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class SonTest extends FatherTest implements Stepfather {
	public void hitChild() {
		System.out.println("这是继父");
	}

	public static void main(String[] args) {
		SonTest son = new SonTest();
		son.pet("这是生父");
		son.hitChild();
	}
}

class FatherTest {
	public void pet(String str) {
		System.out.println(str);
	}
}

interface Stepfather {
	public void hitChild();
}
