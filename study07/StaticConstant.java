package cn.legeyung.study07;

/**
 * 静态方法的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class StaticConstant {
	public static void main(String[] args) {
		StaticContantTest sct = new StaticContantTest();
		System.out.println(sct.eat());
	}
}

class StaticContantTest {
	static final String str = "去吃饭...";

	static String eat() {
		return str;
	}
}
