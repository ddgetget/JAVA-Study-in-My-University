package cn.legeyung.study06;

/**
 * parameter(参数)学习
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class PeopleParameter {
	private String name;
	private String sex;
	private int age;

	public PeopleParameter(String jname, String jsex, int jage) {
		name = jname;
		sex = jsex;
		age = jage;
	}

	public String eat(String food) {
		return "我在吃" + food;
	}

	public void tea() {
		System.out.println("我在喝茶...");
	}

	public static void main(String[] args) {
		PeopleParameter people = new PeopleParameter("张三", "男", 20);
		System.out.println("姓名：" + people.name);
		System.out.println("性别：" + people.sex);
		System.out.println("年龄：" + people.age);
	}
}
