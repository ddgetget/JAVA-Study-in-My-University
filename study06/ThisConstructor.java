package cn.legeyung.study06;

/**
 * this的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class ThisConstructor {
	String name;

	public ThisConstructor(String onename) {
		name = onename;
		System.out.println("姓名：" + name);
	}

	public ThisConstructor() {
		this("张三");
	}

	public static void main(String[] args) {
		new ThisConstructor();
	}
}
