package cn.legeyung.study06;

/**
 * 初始的情况，即默认情况
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class PeopleConstructor {
	private String name;
	private String sex;
	private int age;

	public PeopleConstructor() {
	}

	public String eat(String food) {
		return "我在吃" + food;
	}

	public void tea() {
		System.out.println("我在喝茶...");
	}

	public static void main(String[] args) {

		PeopleConstructor peoplec = new PeopleConstructor();
		System.out.println("姓名的默认初始值：" + peoplec.name);
		System.out.println("性别的默认初始值：" + peoplec.sex);
		System.out.println("年龄的默认初始值：" + peoplec.age);
	}
}
