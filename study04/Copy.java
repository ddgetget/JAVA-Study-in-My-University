package cn.legeyung.study04;

/**
 * 数组的部分复制
 * 
 * @author 雍珑庚(Lege_Yung)
 * 
 */
public class Copy {
	public static void main(String[] args) {
		String str = "HelloWorld!";

		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++)
			ch[i] = str.charAt(i);

		String s = String.copyValueOf(ch);
		String st = String.copyValueOf(ch, 0, 5);

		System.out.println(s);
		System.out.println(st);
	}
}
