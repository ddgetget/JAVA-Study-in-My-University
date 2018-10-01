package cn.legeyung.study06;

/**
 * 构造函数的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Peoplemain {
	private String name;
	private String sex;
	private int age;

	public String eat(String food) {
		return "我在吃" + food;
	}

	public void tea() {
		System.out.println("我在喝茶...");
	}

	public static void main(String[] args) {
		String str = new Peoplemain().eat("苹果");
		System.out.println(str);
		new Peoplemain().tea();
	}
}
