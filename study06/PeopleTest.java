package cn.legeyung.study06;

/**
 * 调用People类
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class PeopleTest {
	public static void main(String[] args) {
		People people = new People();
		System.out.println("个人信息输出：");
		System.out.println("姓名：" + people.name);
		System.out.println("性别：" + people.sex);
		System.out.println("年龄：" + people.age);
		System.out.println("住址：" + people.address);
		System.out.println(people.name + "在干嘛？");
		System.out.println(people.name + people.eat());
	}
}
