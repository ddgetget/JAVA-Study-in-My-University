package cn.legeyung.study05;

/**
 * if ……
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class IfTest {
	public static void main(String[] args) {
		int zage = 22;
		int lage = 23;

		if (zage > lage) {
			System.out.println("张三年龄是：" + zage + "岁");
			System.out.println("李四年龄是：" + lage + "岁");
			System.out.println("张三比李四大");
		}
		if (lage > zage) {
			System.out.println("张三年龄是：" + zage + "岁");
			System.out.println("李四年龄是：" + lage + "岁");
			System.out.println("李四比张三大");
		}
	}
}
