package cn.legeyung.study06;

/**
 * 一个类里面有多个对象的情况
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Peoplemore {
	private String name;
	private String sex;
	private int age;

	public Peoplemore(String nname, String nsex, int nage) {
		name = nname;
		age = nage;
		sex = nsex;
	}

	public Peoplemore(String jname, int jage) {
		name = jname;
		age = jage;
	}

	public static void main(String[] args) {
		Peoplemore peo = new Peoplemore("张三", "男", 20);
		Peoplemore lisi = new Peoplemore("李四", 25);
		System.out.println(peo.name + "的信息：");
		System.out.println("姓名：" + peo.name);
		System.out.println("性别：" + peo.sex);
		System.out.println("年龄:" + peo.age);
		System.out.println(lisi.name + "的信息");
		System.out.println("姓名：" + lisi.name);
		System.out.println("年龄：" + lisi.age);
	}
}
