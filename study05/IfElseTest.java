package cn.legeyung.study05;

/**
 * else if 的使用
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class IfElseTest {
	public static void main(String[] args) {
		int i = 100;
		if (i > 90) {
			System.out.println("张三的成绩是：" + i + "\n" + "评价是：非常优秀！");
		} else if (i > 80) {
			System.out.println("张三的成绩是：" + i + "\n" + "评价是：优秀！");
		} else if (i > 70) {
			System.out.println("张三的成绩是：" + i + "\n" + "评价是：良好！");
		} else if (i > 60) {
			System.out.println("张三的成绩是：" + i + "\n" + "评价是：及格");
		} else {
			System.out.println("张三的成绩是：" + i + "\n" + "评价是：不及格，该努力了！！");
		}
	}
}
