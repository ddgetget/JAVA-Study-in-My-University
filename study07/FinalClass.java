package cn.legeyung.study07;

/**
 * final类的学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class FinalClass {
	public static void main(String[] args) {
		FinalClassTest fct = new FinalClassTest();
		fct.eat = "该去吃饭了";
		fct.str = "十一点半";
		fct.print();
		fct.eat();
	}
}

final class FinalClassTest {
	String str;
	String eat;

	void print() {
		System.out.println("现在时间是" + str);
	}

	void eat() {
		System.out.println(eat);
	}
}
