package cn.legeyung.study09;

/**
 * 内部类测试的主类
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class InnerTest {
	public static void main(String[] args) {
		Outer out = new Outer(); // 创建一个外部类对象
		out.useIner(); // 调用该类的内部类定义的方法
	}
}

class Outer {
	String out_string = "String in Outer";// 设置外部类的变量

	void useIner() { // 设置外部类的方法
		Iner in = new Iner(); // 在外部类中对内部类的对象进行定义
		in.print(); // 调用内部类的方法
	}

	// 创建内部类

	class Iner {
		void print() { // 在内部类中定义的方法
			System.out.println("Iner.print()");
			// 在内部类中访问其宿主类的变量
			System.out.println("use\'" + out_string + "\'");
		}
	}
}
