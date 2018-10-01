package cn.legeyung.study02;

/**
 * Boolean学习
 * @author 雍珑庚(Lege_Yung)
 *
 */
public class BooleanTest {
	static boolean zhangsan;
	static boolean lisi = true;

	public static void main(String[] args) {
		System.out.println("张三：" + zhangsan);
		System.out.println("李四：" + lisi);
		if (zhangsan) {
			System.out.println("张三有时间..");
		}
		if (lisi) {
			System.out.println("李四有时间..");
		}
	}
}
