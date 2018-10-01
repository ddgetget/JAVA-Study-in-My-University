package cn.legeyung.study04;

/**
 * String.compareTo()按字典顺序比较两个字符串。 String.quals()比较此字符串与指定的对象
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Bijiao {
	public static void main(String[] args) {
		String zhagnsan = "Think In Java!";
		String lisi = "Think In Java!";
		String wangwu = "think in java";
		String zhaoliu = "Think in Java";

		if (zhagnsan.equals(lisi))
			System.out.println("张三和李四读书内容相同");
		else
			System.out.println("张三和李四读书内容不同");

		if (lisi.equals(wangwu))
			System.out.println("李四和王五读书内容相同");
		else
			System.out.println("李四和王五读书内容不同");

		if ((wangwu.compareTo(zhaoliu)) > 0)
			// 如果参数字符串等于此字符串，则返回 0 值；如果按字典顺序此字符串小于字符串参数，则返回一个小于 0
			// 的值；如果按字典顺序此字符串大于字符串参数，则返回一个大于 0 的值。
			System.out.println("王五和赵六读书内容相同");
		else
			System.out.println("王五和赵六读书内容不同");
	}
}
